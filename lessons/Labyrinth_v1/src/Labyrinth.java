import java.util.Scanner;

public class Labyrinth {
    public static void main(String[] args) {
        char[][] labyrinth = {
            "############################".toCharArray(),
            "# @   ##############  0 0 ##".toCharArray(),
            "#     ####### 0  #### ### ##".toCharArray(),
            "#     ###             ### ##".toCharArray(),
            "### ##### ###   0######   ##".toCharArray(),
            "###       #### ########   ##".toCharArray(),
            "##############       ## X ##".toCharArray(),
            "#######        ##### #######".toCharArray(),
            "####### #########      0  ##".toCharArray(),
            "#       0  ###### 0       ##".toCharArray(),
            "#  0       ######     0   ##".toCharArray(),
            "############################".toCharArray()
        };

        String command = "";
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        int pLine = 0;
        int pColumn = 0;
        int coins = 0;

        for (int i = 0; i < labyrinth.length; ++i) {
            for (int j = 0; j < labyrinth[i].length; ++j) {
                if(labyrinth[i][j] == '@') {
                    pLine = i;
                    pColumn = j;
                }
            }
        }

        while (!exit) {
            for (int i = 0; i < labyrinth.length; ++i) {
                for (int j = 0; j < labyrinth[i].length; ++j) {
                    System.out.print(labyrinth[i][j]);
                }
                System.out.println();
            }
            System.out.print("Enter command (w, a, s, d, quit): ");
            command = sc.nextLine();
            int oldLine = pLine;
            int oldColumn = pColumn;
            switch (command.toLowerCase()) {
                case "quit":
                    exit = true;
                    break;
                case "w":
                    --pLine;
                    break;
                case "a":
                    --pColumn;
                    break;
                case "s":
                    ++pLine;
                    break;
                case "d":
                    ++pColumn;
                    break;
            }
            if(labyrinth[pLine][pColumn] == '#') {
                pLine = oldLine;
                pColumn = oldColumn;
            } else if(labyrinth[pLine][pColumn] == '0') {
                ++coins;
            } else if(labyrinth[pLine][pColumn] == 'X') {
                exit = true;
            }
            labyrinth[oldLine][oldColumn] = ' ';
            labyrinth[pLine][pColumn] = '@';
        }
    }
}
