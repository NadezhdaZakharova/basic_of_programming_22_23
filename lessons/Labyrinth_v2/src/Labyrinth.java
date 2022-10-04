import java.io.IOException;
import java.util.Scanner;

public class Labyrinth {
    static int personPosLine;
    static int personPosColumn;
    static int exitPosLine;
    static int exitPosColumn;
    static char[][] labyrinth;
    static boolean gameFinished;

    public static void main(String[] args) throws IOException {
        createLabyrinth();
        calcStartPersonPosition();
        calcExitPosition();
        gameFinished = false;

        while(!gameFinished) {
            draw();
            String command = getNextCommand();
            commandProcess(command);
        }
    }

    private static void createLabyrinth() {
        labyrinth = new char[][] {
            "########################".toCharArray(),
            "#     #         #      #".toCharArray(),
            "#     #         ###### #".toCharArray(),
            "#     #####            #".toCharArray(),
            "#             #        #".toCharArray(),
            "#      #      #   #    #".toCharArray(),
            "#      ########   #    #".toCharArray(),
            "#      #          #    #".toCharArray(),
            "########################".toCharArray()
        };
    }

    private static void calcStartPersonPosition() {
        personPosColumn = 1;
        personPosLine = 1;
    }

    private static void calcExitPosition() {
        exitPosColumn = 17;
        exitPosLine = 1;
    }

    private static void draw() throws IOException {
        clearConsole();
        for (int line = 0; line < labyrinth.length; ++line) {
            for (int col = 0; col < labyrinth[line].length; ++col) {
                if(line == personPosLine && col == personPosColumn) {
                    System.out.print('@');
                } else if(line == exitPosLine && col == exitPosColumn) {
                    System.out.print('0');
                } else {
                    System.out.print(labyrinth[line][col]);
                }
            }
            System.out.println();
        }
    }

    private static void clearConsole() throws IOException {
        Runtime.getRuntime().exec( new String[] {"cmd", "/c", "cls"} );
    }

    private static String getNextCommand() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().toLowerCase();
    }

    private static void commandProcess(String command) {
        int oldLine = personPosLine;
        int oldColumn = personPosColumn;
        switch (command) {
            case "w":
                --personPosLine;
                break;
            case "a":
                --personPosColumn;
                break;
            case "s":
                ++personPosLine;
                break;
            case "d":
                ++personPosColumn;
                break;
            case "q":
                gameFinished = true;
                break;
        }
        if(labyrinth[personPosLine][personPosColumn] == '#') {
            personPosLine = oldLine;
            personPosColumn = oldColumn;
        }
    }

}
