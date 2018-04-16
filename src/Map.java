import sun.plugin.dom.css.RGBColor;

import java.awt.*;

public class Map {

    final int PATH = 0;
    final int WALL = 1;
    final int SPAWN = 2;
    final int DOOR = 3;
    final int MOSS = 4;
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
                    layout[x][3] = MOSS;
                    layout[x][4] = WALL;
                    layout[x][5] = MOSS;
                    layout[x][6] = WALL;
                }
                if(x%2 == 0){
                    layout[x][0] = MOSS;
                    layout[x][14] = MOSS;
                }
        }
        for(int y = 0; y < height; y++){
            layout[0][y] = WALL;
            layout[14][y] = WALL;
            if(y%2 == 0){
                layout[0][y] = MOSS;
                layout[14][y] = MOSS;
            }
        }

        layout[2][9] = MOSS;
        layout[3][10] = WALL;
        layout[4][11] = MOSS;
        layout[5][12] = WALL;
        layout[6][12] = MOSS;
        layout[7][12] = WALL;
        layout[8][12] = MOSS;
        layout[9][12] = WALL;
        layout[10][11] = MOSS;
        layout[11][10] = WALL;
        layout[12][9] = MOSS;
        layout[7][8] = DOOR;
        layout[7][4] = SPAWN;








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
                    g.setColor(new Color(0,0,255));
                    g.fillRect(x*SIZE, y*SIZE, SIZE, SIZE);
                    g.setColor(new Color(255, 0, 0));
                    g.drawOval(x*SIZE, y*SIZE, width, height);
                    g.fillOval(x*SIZE, y*SIZE, width, height);
                }

            }
        }
    }

}
