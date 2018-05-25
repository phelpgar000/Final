public class Stats {

    private static boolean lP, rP, uP, dP, blocked;
    private static boolean play = false;
    private static boolean pause = false;
    private static boolean menu = true;
    private static boolean end = false;
    private static boolean death = false;
    public static int level = 0;

    public static void leftYes(){lP = true;}
    public static void rightYes(){rP = true;}
    public static void upYes(){uP = true;}
    public static void downYes(){dP = true;}
    public static void blockedYes(){blocked = true;}

    public static void leftNo(){lP = false;}
    public static void rightNo(){rP = false;}
    public static void upNo(){uP = false;}
    public static void downNo(){dP = false;}
    public static void blockedNo(){blocked = false;}

    public static boolean isLeftPressed(){ return lP;}
    public static boolean isRightPressed(){ return rP;}
    public static boolean isUpPressed(){ return uP;}
    public static boolean isDownPressed(){ return dP;}
    public static boolean isBlocked(){return blocked;}
    public static boolean isMenu(){return menu;}
    public static boolean isPlay(){return play;}
    public static boolean isPause(){return pause;}
    public static boolean isEnd(){return end;}
    public static boolean isDeath(){return death;}

    public static void startMenu(){menu = true;}
    public static void endMenu(){menu = false;}
    public static void startPlay(){play = true;}
    public static void endPlay(){play = false;}
    public static void startPause(){pause = true;}
    public static void endPause(){pause = false;}
    public static void startEnd(){end = true;}
    public static void endEnd(){end = false;}
    public static void startDeath(){death = true;}
    public static void endDeath(){death = false;}

    public static void togglePause(){
        if(pause){
            pause = false;
        }
        else{
            pause = true;
        }
    }
    public static void togglePlay(){
        if(play){
            play = false;
        }
        else{
            play = true;
        }
    }
    public static void toggleMenu(){
        if(menu){
            menu = false;
        }
        else{
            menu = true;
        }
    }

    public static void level1(){level = 1;}

}
