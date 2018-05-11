import java.awt.*;

public class Player extends Things{

    public Player(Color color, int x, int y, int width, int height){

        super(color, x, y, width, height);

    }

    public void paint(Graphics g){

        g.setColor(color);
        g.fillRect((int)x, (int)y, width, height);
    }

    @Override
    public void move() {

            if (Stats.isLeftPressed()) {
                x -= 3;
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
