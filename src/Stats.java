public class Stats {

    private static boolean lP, rP, uP, dP;

    public static void leftYes(){lP = true;}
    public static void rightYes(){rP = true;}
    public static void upYes(){uP = true;}
    public static void downYes(){dP = true;}

    public static void leftNo(){lP = false;}
    public static void rightNo(){rP = false;}
    public static void upNo(){uP = false;}
    public static void downNo(){dP = false;}

    public static boolean isLeftPressed(){ return lP;}
    public static boolean isRightPressed(){ return rP;}
    public static boolean isUpPressed(){ return uP;}
    public static boolean isDownPressed(){ return dP;}
}
