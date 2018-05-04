import java.awt.*;

public class Things implements Move, Paint{

    Color color;
    int width, height, nx, ny;
    int biggnes = 15;

    double dx, dy, x, y;

    final int Movement = 3;

    public Map map;
    public Board board;

    public Things(Color color, int x, int y, int width, int height){

        this.color = color;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void move() {

        double nextLeft =  x + dx;
        double nextRight = x + width + dx;
        double nextTop = y + dy;
        double nextBottom = y + height + dy;

        if(board.checkCollisions()) {
            if (Stats.isLeftPressed() == true) {
                x -= 3;
            }
            if (Stats.isRightPressed() == true) {
                x += 3;
            }
            if (Stats.isUpPressed() == true) {
                y -= 3;
            }
            if (Stats.isDownPressed() == true) {
                y += 3;
            }
        }

    }

    public void checking(double nextRight, double nextLeft, double nextTop, double nextBottom){
        if(nextRight != map.layout[(int)x][(int)y] && nextTop != map.layout[(int) x][(int) y]){
            map.block(nextRight, nextTop);
        }
    }

    @Override
    public void paint(Graphics g) {

    }

    @Override
    public void setPosition(int x, int y) {

    }
}
