package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter cells: ");
        char[] grid = scanner.nextLine().toCharArray();

        // Printing out the grid that based on the user input
        System.out.println("---------");
        for (int i = 0; i < grid.length; i += 3) {
            System.out.println("| " + grid[i] + " " + grid[i + 1] + " " + grid[i + 2] + " |");
        }
        System.out.println("---------");

        // Logic and count variables init
        boolean xWin = false, oWin = false;
        int xCount = 0, oCount = 0;

        // Counting the elements in the grid
        for (char c : grid) {
            if (c == 'X') {
                xCount += 1;
            } else if (c == 'O') {
                oCount += 1;
            }
        }

        int _Count = 9 - xCount - oCount;

        // Horizontal and vertical check
        for (int i = 0, j = 0; i < grid.length; i += 3, j += 1) {
            if (grid[i] == grid[i + 1] && grid[i] == grid[i + 2]) {
                if (grid[i] == 'X') {
                    xWin = true;
                } else if (grid[i] == 'O') {
                    oWin = true;
                }
            }

            if (grid[j] == grid[j + 3] && grid[j] == grid[j + 6]) {
                if (grid[j] == 'X') {
                    xWin = true;
                } else if (grid[j] == 'O') {
                    oWin = true;
                }
            }
        }

        // Checking diagonals
        if ((grid[0] == grid[4] && grid[0] == grid[8]) || (grid[6] == grid[4] && grid[6] == grid[2])) {
            if (grid[4] == 'X') {
                xWin = true;
            } else if (grid[4] == 'O') {
                oWin = true;
            }
        }

        // Printing out game state
        if (Math.abs(xCount - oCount) > 1 || xWin && oWin) {
            System.out.println("Impossible");
        } else if (xWin) {
            System.out.println("X wins");
        } else if (oWin) {
            System.out.println("O wins");
        } else if (_Count == 0) {
            System.out.println("Draw");
        } else {
            System.out.println("Game not finished");
        }
    }
}
