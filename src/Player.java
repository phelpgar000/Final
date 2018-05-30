import java.awt.*;

public class Player extends Things{

    int SIZE = 30;
    float dx = (float)x + SIZE;
    float dy = (float)y + SIZE;

    Wall wall = new Wall(Color.GRAY, (int)x, (int)y, SIZE, SIZE);

    public Player(Color color, int x, int y, int width, int height){

        super(color, x, y, width, height);

    }

    public void paint(Graphics g){

        g.setColor(color);
        g.fillRect((int)x, (int)y, width, height);

    }

    public void decide(float dx, float dy){

        float nx = (float)x + dx;
        float ny = (float)y + dy;

        if(valid(nx, ny)){
            x = nx;
            y = ny;

            Stats.blockedYes();
        }

        Stats.blockedNo();
    }


    @Override
    public void move() {

        if (Stats.isLeftPressed()) {
            x -= 3;
            collidesWith(wall);
        }
        if (Stats.isRightPressed()) {
            x += 3;
        }
        if (Stats.isUpPressed()) {
            y -= 3;
        }
        if (Stats.isDownPressed()) {
            y += 3;
        }

    }

}
