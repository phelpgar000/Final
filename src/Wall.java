import java.awt.*;

public class Wall extends Things {


    public Wall(Color color, int x, int y, int width, int height) {

        super(color, x, y, width, height);

    }

    public void paint(Graphics g) {

        g.setColor(color);
        g.fillRect((int) x, (int) y, width, height);
    }

}
