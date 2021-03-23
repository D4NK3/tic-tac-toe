# tic-tac-toe

## Under construction!

The tic-tac-toe project aims to provide a program which simulates the basic operation logic of a tic-tac-toe(3x3) game. 
This project is an implementation of the Tic-Tac-Toe project from the [Jetbrains Academy](https://www.jetbrains.com/academy/) (I attend their Java course). This project was made for personal practice and fun.

## Table of Contents
- [Installing, Compiling and Running](#installing-compiling-and-running)
- [Manual](#manual)
- [Usage Examples](#usage-examples)
- [Troubleshooting](#troubleshooting)
- [License](#license)

## Installing, Compiling and Running
- Installing<br/>
You first need to clone this repository. After that you need to compile the `TicTacToe.java` file. 

- Compiling<br/>
If you have JDK installed on your computer then use the `javac TicTacToe.java` command to compile the program.

- Running<br/>
After compilation you can run your program using the `java TicTacToe.class` command.

Note: I used JDK version 15.0.2 for developing. JDK must be installed on you computer to be able to compile and run this project. Else you can download it from the official page of [Oracle](https://www.oracle.com/java/technologies/javase-downloads.html). 

## Manual
As previously mentioned, this program aims to simulate a Tic-Tac-Toe game. It communicates through the standard input and output.
- **Stating phase**
  - When you start the game it inicializes a 3x3 empty grid and prints it out to the standard output.

- **Making steps**
  - **Asking for input**
    - After the inicialization phase the game asks you for a pair of coordinates (x y).
  - **User input validation**
    - The game checks the format of the input, the validity of the input(between 1 and 3) and the emptyness of the asked cell.
  - **Placing O or X**
    - If the users input passed the validation an 'O' or a 'X' will be placed in the grid to the right coordinates.
    - The player who makes the first step in the game has the 'X' and the other the 'O'.
  - **Analyzing the games status**
    - After each step the game analyzes its status. It searches the rows, columns, diagonals for winners. If the a winner is found or all of the cells are full the game ends.
    - Else it asks the other player for the next input.
  

## Usage Examples
- Init phase: \
![Printing out the empty grid to the standard output][usage1]

- First step after init: \
![Fist step after init][usage2]

- Wrong input type: \
![Wrong input type][usage3]

- Wrong input range: \
![Wrong input range][usage4]

- Occupied cell: \
![Wrong input: Already played cell][usage5]

- Some simple steps: \
![Making some steps][usage6]
 
- Game ends(X wins): \
![Game ends with win ][usage7]
  
## Troubleshooting

- If you don't have Oracle JDK installed on your computer, then you can [download](https://www.oracle.com/java/technologies/javase-downloads.html) it.
- If you can't run the program with the `java TicTacToe.class` command, then it is possibly that you need to specify the exact location of your .class file. You can do it with the -cp option, which stands for Class Path.

## License
The program and associated documentation in this repo are released under the [MIT License](https://en.wikipedia.org/wiki/MIT_License).<br/>
When you contribute to this repository you are doing so under the above license.

[usage1]: https://github.com/D4NK3/tic-tac-toe/blob/main/img/init.png
[usage2]: https://github.com/D4NK3/tic-tac-toe/blob/main/img/stepAfterInit.png
[usage3]: https://github.com/D4NK3/tic-tac-toe/blob/main/img/wrongType.png
[usage4]: https://github.com/D4NK3/tic-tac-toe/blob/main/img/wrongRange.png
[usage5]: https://github.com/D4NK3/tic-tac-toe/blob/main/img/occupiedCell.png
[usage6]: https://github.com/D4NK3/tic-tac-toe/blob/main/img/someStep.png
[usage7]: https://github.com/D4NK3/tic-tac-toe/blob/main/img/xWon.png
