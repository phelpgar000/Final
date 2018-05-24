public class Stats {

    private static boolean lP, rP, uP, dP, sP, s1, s2, s3, blocked;
    private static boolean isPlay = false;
    private static boolean isPause = false;
    private static boolean isMenu = true;
    private static boolean isEnd = false;

    public static void leftYes(){lP = true;}
    public static void rightYes(){rP = true;}
    public static void upYes(){uP = true;}
    public static void downYes(){dP = true;}
    public static void spaceYes(){sP = true;}
    public static void oneYes(){s1 = true;}
    public static void twoYes(){s2 = true;}
    public static void threeYes(){s3 = true;}
    public static void blockedYes(){blocked = true;}

    public static void leftNo(){lP = false;}
    public static void rightNo(){rP = false;}
    public static void upNo(){uP = false;}
    public static void downNo(){dP = false;}
    public static void spaceNo(){sP = false;}
    public static void oneNo(){s1 = false;}
    public static void twoNo(){s2 = false;}
    public static void threeNo(){s3 = false;}
    public static void blockedNo(){blocked = false;}

    public static boolean isLeftPressed(){ return lP;}
    public static boolean isRightPressed(){ return rP;}
    public static boolean isUpPressed(){ return uP;}
    public static boolean isDownPressed(){ return dP;}
    public static boolean isSpacePressed(){return sP;}
    public static boolean isOne(){return s1;}
    public static boolean isTwo(){return s2;}
    public static boolean isThree(){return s3;}
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
}
