import java.awt.*;
import java.awt.image.ImageObserver;

public class Map {

    final int PATH = 0;
    final int WALL = 1;
    final int SPAWN = 2;
    final int END = 3;
    final int DOOR = 4;
    final int MOSS = 5;
    final int TRAPUP = 6;
    final int TRAPLEFT = 7;
    final int TRAPRIGHT = 9;
    final int TRAPDOWN = 10;
    int width = 14;
    int height = 14;
    int spawnX, spawnY;
    final int SIZE = 30;
    Image img1 = Toolkit.getDefaultToolkit().getImage("mossy.jpg");
    Image img2 = Toolkit.getDefaultToolkit().getImage("wall.jpg");
    int[][] layout = new int[width][height];

    public Map(){

        for(int x = 0; x < width; x++){
                layout[x][0] = WALL;
                layout[x][13] = WALL;
                layout[x][2] = WALL;


        }
        for(int y = 0; y < height; y++){
            layout[0][y] = WALL;
            layout[13][y] = WALL;
            layout[2][y] = WALL;

        }

        layout[1][2] = DOOR;
        layout[2][1] = DOOR;
        layout[1][1] = SPAWN;
        layout[11][10] = END;

    }

    public void paint(Graphics g){

        for(int x = 0; x < width; x++){
            for(int y = 0; y < height; y++){
                g.setColor(Color.WHITE);
                g.setFont(new Font("Serif", Font.BOLD, 30));
                printSimpleString(String.valueOf(x), SIZE, SIZE*x, SIZE, g);
                printSimpleString(String.valueOf(y), SIZE, 0, SIZE*y+SIZE, g);
                g.setColor(Color.lightGray);
                if(layout[x][y] == WALL){
                    g.setColor(new Color(64,64,64));
                }
                if(layout[x][y] == DOOR){
                    g.setColor(new Color(77, 38, 0));
                }
                if(layout[x][y] == MOSS){
                    g.setColor(new Color(0, 51, 0));
                }

                g.fillRect(x*SIZE, y*SIZE, SIZE, SIZE);
                g.setColor(Color.GRAY);
                if(layout[x][y] == DOOR){
                    g.setColor(new Color(77, 38, 0));
                }
                if(layout[x][y] == WALL){
                    g.setColor(new Color(64,64,64));
                }
                if(layout[x][y] == MOSS){
                    g.setColor(new Color(0, 51, 0));
                }
                g.drawRect(x*SIZE, y*SIZE, SIZE, SIZE);
                if(layout[x][y] == SPAWN){
                    spawnX = x*SIZE+SIZE/4;
                    spawnY = y*SIZE+SIZE/4;
                    g.setColor(new Color(0,0,51));
                    g.fillRect(x*SIZE, y*SIZE, SIZE, SIZE);
                    g.drawOval(x*SIZE+(SIZE/4), y*SIZE+(SIZE/4), width, height);
                    g.fillOval(x*SIZE+(SIZE/4), y*SIZE+(SIZE/4), width, height);
                }
                if(layout[x][y] == END){
                    g.setColor(new Color(51, 51, 0));
                    g.fillRect(x*SIZE, y*SIZE, SIZE, SIZE);
                    g.setColor(new Color(102, 0, 102));
                }

            }
        }
    }

    public int getSPAWNX(){
        return spawnX;
    }

    public int getSPAWNY(){
        return spawnY;
    }

    public void block(double x, double y){
        if(layout[(int)x][(int)y] == WALL){
            Stats.blockedYes();
        }
        else{
            Stats.blockedNo();
        }
    }

    private void printSimpleString(String s, int width, int XPos, int YPos, Graphics g2d){
        int stringLen = (int)g2d.getFontMetrics().getStringBounds(s, g2d).getWidth();
        int start = width/2 - stringLen/2;
        g2d.drawString(s, start + XPos, YPos);
    }

}
