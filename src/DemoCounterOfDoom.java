public class DemoCounterOfDoom {
    static double demos = 0;
    static double games = 0;
    static double demoed = 0;
    static double bigDemos = 0;
    static double bigDemoed = 0;
    public static void increaseDemo(){
        demos++;
        bigDemos++;
    }
    public static void increaseDemoed(){
        demoed++;
        bigDemoed++;
    }
    public static void resetDemos(){
        demos = 0;
    }
    public static void resetDemoed(){
        demoed = 0;
    }
    public static void increaseGame(){
        games++;
    }
    public static double getAverageDemosPerGame(){
        return bigDemos / games;
    }
    public static double getGameKD(){
        if(demoed == 0){
            return demos;
        }
        return demos / demoed;
    }
    public static double getSessionKD(){
        if(bigDemoed == 0){
            return bigDemos;
        }
        return bigDemos / bigDemoed;
    }
}
