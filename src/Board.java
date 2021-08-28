public class Board {

    private char[][] board = {{' ', 'A', ' ', 'B', ' ', 'C'},
            {'1', ' ', '|', ' ', '|', ' '}, {' ', '_', ' ', '_', ' ', '_'},
            {'2', ' ', '|', ' ', '|', ' '}, {' ', '_', ' ', '_', ' ', '_'},
            {'3', ' ', '|', ' ', '|', ' '}};

    public Board() {
    }

    public void printBoard() {
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    //Assigns player input and checks if this cell is in use already
    public void boardInput(String userInput, Player player) {
        if (userInput.equalsIgnoreCase("a1") || userInput.equalsIgnoreCase("1a")) {
            if (board[1][1] != ' ') {
                System.out.println("This cell has already been taken. Choose another cell");

                //NEED A METHOD HERE FROM GAME
            } else {
                System.out.println("You chose cell A1");
                board[1][1] = player.getInput();
                printBoard();
            }
        }
        if (userInput.equalsIgnoreCase("b1") || userInput.equalsIgnoreCase("1b")) {

            if (board[1][3] != ' ') {
                System.out.println("This cell has already been taken. Choose another cell");
            } else {
                System.out.println("You chose cell B1");
                board[1][3] = player.getInput();
                printBoard();
            }
        }
        if (userInput.equalsIgnoreCase("c1") || userInput.equalsIgnoreCase("1c")) {
            if (board[1][5] != ' ') {
                System.out.println("This cell has already been taken. Choose another cell");
            } else {
                System.out.println("You chose cell C1");
                board[1][5] = player.getInput();
                printBoard();
            }
        }
        if (userInput.equalsIgnoreCase("a2") || userInput.equalsIgnoreCase("2a")) {
            if (board[3][1] != ' ') {
                System.out.println("This cell has already been taken. Choose another cell");
            } else {
                System.out.println("You chose cell A2");
                board[3][1] = player.getInput();
                printBoard();
            }
        }
        if (userInput.equalsIgnoreCase("b2") || userInput.equalsIgnoreCase("2b")) {
            if (board[3][3] != ' ') {
                System.out.println("This cell has already been taken. Choose another cell");
            } else {
                System.out.println("You chose cell B2");
                board[3][3] = player.getInput();
                printBoard();
            }
            if (userInput.equalsIgnoreCase("c2") || userInput.equalsIgnoreCase("2c")) {
                if (board[5][5] != ' ') {
                    System.out.println("This cell has already been taken. Choose another cell");
                } else {
                    System.out.println("You chose cell C2");
                    board[5][5] = player.getInput();
                    printBoard();
                }
            }
            if (userInput.equalsIgnoreCase("a3") || userInput.equalsIgnoreCase("3a")) {
                if (board[7][1] != ' ') {
                    System.out.println("This cell has already been taken. Choose another cell");
                } else {
                    System.out.println("You chose cell A3");
                    board[7][1] = player.getInput();
                    printBoard();
                }
            }
            if (userInput.equalsIgnoreCase("b3") || userInput.equalsIgnoreCase("3b")) {
                if (board[7][3] != ' ') {
                    System.out.println("This cell has already been taken. Choose another cell");
                } else {
                    System.out.println("You chose cell B3");
                    board[7][3] = player.getInput();
                    printBoard();
                }
            }
            if (userInput.equalsIgnoreCase("c3") || userInput.equalsIgnoreCase("3c")) {
                if (board[7][5] != ' ') {
                    System.out.println("This cell has already been taken. Choose another cell");
                } else {
                    System.out.println("You chose cell C2");
                    board[7][5] = player.getInput();
                    printBoard();
                }
            }

        }

    }
}
