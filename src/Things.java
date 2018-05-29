import java.awt.*;

public class Things implements Move, Paint{

    Color color;
    int width, height, nx, ny;
    int biggnes = 15;

    double dx, dy, x, y;
    double nextLeft =  x + dx;
    double nextRight = x + width + dx;
    double nextTop = y + dy;
    double nextBottom = y + height + dy;
    int SIZE = 30;

    final int Movement = 3;

    public Map map;
    public Board board;
    public Traps traps;

    public Things(Color color, int x, int y, int width, int height){

        this.color = color;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Rectangle getBounds() {
        return new Rectangle((int)(x + dx), (int)(y + dy), width, height);
    }

    public void checkCollisions(){

    }

    public void collidesWith(Rectangle rectangle){

            if(getBounds().intersects(rectangle.getBounds())){
                dx = 0;
                dy = 0;

            }

    }

    public boolean valid(double nx, double ny){

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

    public int getX(){
        return (int)x;
    }

    public int getY(){
        return (int)y;
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
