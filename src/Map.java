import com.sun.glass.ui.Size;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.util.ArrayList;
import java.util.List;

    public class Map {

        final int PATH = 0;
        final int WALL = 1;
        final int SPAWN = 2;
        final int END = 3;
        final int MOSS = 4;
        final int TRAPUP = 5;
        final int TRAPLEFT = 6;
        final int TRAPRIGHT = 7;
        final int TRAPDOWN = 8;
        int wallX, wallY;
        int width = 14;
        int height = 14;
        int spawnX, spawnY;
        int numWAll = 0;
        final int SIZE = 30;
        int[][] layout = new int[width][height];
        List<Things> walls = new ArrayList<Things>();



        public Map(){

            if(Stats.level == 1) {
                for (int x = 0; x < width; x++) {
                    layout[x][0] = WALL;
                    layout[x][13] = WALL;
                    layout[x][2] = WALL;

                    numWAll += 3;
                }
                for (int y = 0; y < height; y++) {
                    layout[0][y] = WALL;
                    layout[13][y] = WALL;
                    layout[2][y] = WALL;

                    numWAll += 3;
                }

                layout[1][1] = SPAWN;
                layout[11][10] = END;
                layout[2][1] = PATH;
                layout[1][2] = PATH;
            }
            if(Stats.level == 2){
                for (int x = 0; x < width; x++) {
                    layout[x][0] = WALL;
                    layout[x][13] = WALL;
                    layout[x][2] = WALL;
                    layout[x][4] = WALL;

                    numWAll += 3;
                }
                for (int y = 0; y < height; y++) {
                    layout[0][y] = WALL;
                    layout[13][y] = WALL;
                    layout[2][y] = WALL;
                    layout[4][y] = WALL;

                    numWAll += 3;
                }

                layout[6][7] = SPAWN;
                layout[12][12] = END;
                layout[2][1] = PATH;
                layout[1][2] = PATH;

            }

            for(int x = 0; x < width; x++){
                for(int y = 0; y < height; y++){
                    if(layout[x][y] == WALL){
                        walls.add(new Wall(Color.CYAN, x, y, SIZE, SIZE));
                    }
                }
            }

            setSpawn();

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
                    if(layout[x][y] == MOSS){
                        g.setColor(new Color(0, 51, 0));
                    }
                    g.fillRect(x*SIZE, y*SIZE, SIZE, SIZE);
                    g.setColor(Color.WHITE);
                    if(layout[x][y] == WALL){
                        g.setColor(new Color(64,64,64));
                    }
                    if(layout[x][y] == MOSS){
                        g.setColor(new Color(0, 51, 0));
                    }
                    g.drawRect(x*SIZE, y*SIZE, SIZE, SIZE);
                    if(layout[x][y] == SPAWN){
                        spawnX = x*SIZE;
                        spawnY = y*SIZE;
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

        public void setSpawn() {
            for (int x = 0; x < width; x++) {
                for (int y = 0; y < height; y++) {
                    if (layout[x][y] == SPAWN) {
                        spawnX = x * SIZE + (SIZE/4);
                        spawnY = y * SIZE + (SIZE/4);
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

        public boolean block(double x, double y){
            return layout[(int)(x*SIZE)][((int)y*SIZE)] == WALL;
        }

        private void printSimpleString(String s, int width, int XPos, int YPos, Graphics g2d){
            int stringLen = (int)g2d.getFontMetrics().getStringBounds(s, g2d).getWidth();
            int start = width/2 - stringLen/2;
            g2d.drawString(s, start + XPos, YPos);
        }

    }
