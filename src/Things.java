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

    public void checkCollisions(Traps other){
        if(this.getBounds().intersects(other.getBounds())){
            Stats.blockedYes();
        }
        else{
            Stats.blockedNo();
        }
    }

    @Override
    public void move() {

        if(board.stuff.get(0) instanceof Player) {
            if (Stats.isLeftPressed() && !Stats.isBlockedLeft()) {
                x -= 3;
            }
            if (Stats.isRightPressed() && !Stats.isBlockedRight()) {
                x += 3;
            }
            if (Stats.isUpPressed() && !Stats.isBlockedUp()) {
                y -= 3;
            }
            if (Stats.isDownPressed() && !Stats.isBlockedDown()) {
                y += 3;
            }
        }

    }

    public void checking(double nextRight, double nextLeft, double nextTop, double nextBottom){
        if(nextRight != map.layout[(int)x][(int)y] && nextTop != map.layout[(int) x][(int) y]){
            map.block(nextRight, nextTop);
        }
        if(nextLeft != map.layout[(int)x][(int)y] && nextBottom != map.layout[(int) x][(int) y]){
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
