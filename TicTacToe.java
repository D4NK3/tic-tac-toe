package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter cells: ");
        String input = scanner.nextLine();

        char[] grid = new char[input.length()];

        for(int i = 0; i < input.length(); i++){
            grid[i] = input.charAt(i);
        }

        System.out.println("---------");
        String line = "";
        for (int i = 0; i < input.length(); i++){
            String tmp = line;
            if (i % 3 == 0){
                line = tmp.concat("| " + grid[i] + " ");
            } else if ((i + 1) % 3 == 0 ){
                line = tmp.concat(" " + grid[i] + " |");
                System.out.println(line);
                line = "";
            } else {
                line = tmp.concat(String.valueOf(grid[i]));
            }
        }
        System.out.println("---------");
        // System.out.println("X O X\nO X O\nX X O");
    }
}
