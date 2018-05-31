import java.awt.*;

public class Player extends Things{

    int SIZE = 3;
    float dx =  SIZE;
    float dy =  SIZE;

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
            x -= dx;

        }
        if (Stats.isRightPressed()) {
            x += dx;
        }
        if (Stats.isUpPressed()) {
            y -= dy;
        }
        if (Stats.isDownPressed()) {
            y += dy;
        }

    }

}
