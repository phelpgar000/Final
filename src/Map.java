import java.awt.*;

public class Map {

    final int PATH = 0;
    final int WALL = 1;
    int width = 15;
    int height = 15;
    final int SIZE = 30;
    int[][] layout = new int[width][height];

    public Map(){

        for(int x = 0; x < width; x++){
                layout[x][0] = WALL;
                layout[x][14] = WALL;
                if(x == 4 || x == 10){
                    layout[x][2] = WALL;
                    layout[x][3] = WALL;
                    layout[x][4] = WALL;
                    layout[x][5] = WALL;
                    layout[x][6] = WALL;
                }
        }
        for(int y = 0; y < height; y++){
            layout[0][y] = WALL;
            layout[14][y] = WALL;
        }



    }

    public void paint(Graphics g){

        for(int x = 0; x < width; x++){
            for(int y = 0; y < height; y++){
                g.setColor(Color.lightGray);
                if(layout[x][y] == WALL){
                    g.setColor(Color.BLACK);
                }

                g.fillRect(x*SIZE, y*SIZE, SIZE, SIZE);
                g.setColor(Color.GRAY);
                g.drawRect(x*SIZE, y*SIZE, SIZE, SIZE);
            }
        }
    }

}
