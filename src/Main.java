import java.util.Scanner;
void main() {
    Scanner scan = new Scanner(System.in);
    int i = 0;
    while(i < 1) {
        System.out.println("What would you like to add? ");
        String input = scan.nextLine();
        switch (input) {
            case "1" -> DemoCounterOfDoom.increaseDemo();
            case "3" -> {
                DemoCounterOfDoom.increaseGame();
                DemoCounterOfDoom.resetDemos();
                DemoCounterOfDoom.resetDemoed();
            }
            case "2" -> DemoCounterOfDoom.increaseDemoed();
            case "stop" -> i++;
        }
        System.out.println("Average Demos per Game: " + DemoCounterOfDoom.getAverageDemosPerGame());
        System.out.println("Game KD: " + DemoCounterOfDoom.getGameKD());
        System.out.println("Session KD: " + DemoCounterOfDoom.getSessionKD());
    }

}
