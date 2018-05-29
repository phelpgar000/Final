import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Wall extends Things {

    List<Things> wall = new ArrayList<Things>();

    public Wall(Color color, int x, int y, int width, int height) {

        super(color, x, y, width, height);

    }

    public void create(){
        if(!valid(x, y)){
            wall.add(new Wall(Color.GRAY , (int)x, (int)y, SIZE, SIZE));
        }
    }

    public void paint(Graphics g) {

        g.setColor(color);
        g.fillRect((int) x, (int) y, width, height);
    }

}
