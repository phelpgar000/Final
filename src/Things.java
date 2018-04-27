import java.awt.*;

public class Things implements Move, Paint{

    Color color;
    int x, y, width, height, nx, ny;
    int biggnes = 15;

    double dx, dy;

    final int Movement = 3;

    public Map map;

    public Things(Color color, int x, int y, int width, int height){

        this.color = color;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void move() {

        if(Stats.isLeftPressed() == true){
            x -= 3;
        }
        if(Stats.isRightPressed() == true){
            x += 3;
        }
        if(Stats.isUpPressed() == true){
            y -= 3;
        }
        if(Stats.isDownPressed() == true){
            y += 3;
        }
    }

    public boolean checkCollisions(int nx, int ny){
        if(Map.block(nx - biggnes, ny - biggnes)){
            return false;
        }
        if(Map.block(nx + biggnes, ny - biggnes)){
            return false;
        }
    }

    @Override
    public void paint(Graphics g) {

    }

    @Override
    public void setPosition(int x, int y) {

    }
}
