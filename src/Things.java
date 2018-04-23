import java.awt.*;

public class Things implements Move, Paint{

    Color color;
    int x, y, width, height;

    double dx, dy;

    final int Movement = 3;

    public Things(Color color, int x, int y, int width, int height){

        this.color = color;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void move() {

    }

    @Override
    public void paint(Graphics g) {

    }

    @Override
    public void setPosition(int x, int y) {

    }
}
