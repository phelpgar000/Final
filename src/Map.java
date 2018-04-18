import java.awt.*;

public class Map {

    final int PATH = 0;
    final int WALL = 1;
    final int SPAWN = 2;
    final int DOOR = 3;
    final int MOSS = 4;
    int width = 14;
    int height = 14;
    final int SIZE = 30;
    int[][] layout = new int[width][height];



    public Map(){

        for(int x = 0; x < width; x++){
                layout[x][0] = WALL;
                layout[x][13] = WALL;


        }
        for(int y = 0; y < height; y++){
            layout[0][y] = WALL;
            layout[13][y] = WALL;

        }

    }

    public void paint(Graphics g){

        for(int x = 0; x < width; x++){
            for(int y = 0; y < height; y++){
                g.setColor(Color.lightGray);
                if(layout[x][y] == WALL){
                    g.setColor(new Color(64,64,64));
                }
                if(layout[x][y] == DOOR){
                    g.setColor(new Color(77, 38, 0));
                }
                if(layout[x][y] == MOSS){

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
                    g.setColor(new Color(0,0,255));
                    g.fillRect(x*SIZE, y*SIZE, SIZE, SIZE);
                    g.setColor(new Color(255, 0, 0));
                    g.drawOval(x*SIZE+(SIZE/4), y*SIZE+(SIZE/4), width, height);
                    g.fillOval(x*SIZE+(SIZE/4), y*SIZE+(SIZE/4), width, height);
                }

            }
        }
    }

}
