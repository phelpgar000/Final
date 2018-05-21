import java.awt.*;

public class Player extends Things{

    float SIZE = 0.3f;

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

    public boolean valid(float nx, float ny){

        if(map.block(nx-SIZE, ny-SIZE)){
            return false;
        }
        if(map.block(nx+SIZE, ny-SIZE)){
            return false;
        }
        if(map.block(nx-SIZE, ny+SIZE)){
            return false;
        }
        if(map.block(nx+SIZE, ny+SIZE)){
            return false;
        }

        return true;

    }

    @Override
    public void move() {


            if (Stats.isLeftPressed()) {
                x -= 1;
            }
            if (Stats.isRightPressed()) {
                x += 1;
            }
            if (Stats.isUpPressed()) {
                y -= 1;
            }
            if (Stats.isDownPressed()) {
                y += 1;
            }

    }
}
