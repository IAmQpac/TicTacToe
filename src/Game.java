public class Game {
    private Player player1;
    private Player player2;
    private Board board;
    private boolean winner = false;

    public Game(Player player1, Player player2,Board board) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = board;
    }

    //winning condition method
    public boolean checkWinner(Board board, Player player){

        //--vertical--
        if (board.getBoard()[1][1] == player.getInput() &&  board.getBoard()[1][3] == player.getInput() && board.getBoard()[1][5] == player.getInput())
            return true;
        else if (board.getBoard()[3][1] == player.getInput() &&  board.getBoard()[3][3] == player.getInput() && board.getBoard()[3][5] == player.getInput())
            return true;
        else if (board.getBoard()[5][1] == player.getInput() &&  board.getBoard()[5][3] == player.getInput() && board.getBoard()[5][5] == player.getInput())
            return true;

        //--Horozontal--
        else if (board.getBoard()[1][1] == player.getInput() &&  board.getBoard()[3][1] == player.getInput() && board.getBoard()[5][1] == player.getInput())
            return true;
        else if (board.getBoard()[1][3] == player.getInput() &&  board.getBoard()[3][3] == player.getInput() && board.getBoard()[5][3] == player.getInput())
            return true;
        else if (board.getBoard()[1][5] == player.getInput() &&  board.getBoard()[3][5] == player.getInput() && board.getBoard()[5][5] == player.getInput())
            return true;

        //--angle--
        else if (board.getBoard()[1][1] == player.getInput() &&  board.getBoard()[3][3] == player.getInput() && board.getBoard()[5][5] == player.getInput())
            return true;
        else if (board.getBoard()[1][5] == player.getInput() &&  board.getBoard()[3][3] == player.getInput() && board.getBoard()[5][1] == player.getInput())
            return true;
        else return false;


    }

    //has to loop until theres a winner
    public void play(){
        System.out.println("\nWelcome to the game of TicTacToe! May the best win");
        while (!winner){
            board.boardInput(player1.askPlayerCellInput(), player1);
            if (checkWinner(board,player1)){
                System.out.println(player1.getName() + " won!");
                break;
            }
            board.boardInput(player2.askPlayerCellInput(), player2);
            if (checkWinner(board,player2)){
                System.out.println(player2.getName() + " won!");
                break;
            }
        }

    }


}
