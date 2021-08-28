public class Game {
    private Player a;
    private Player b;
    private Board board;
    private boolean winner = false;

    public Game(Player a, Player b,Board board) {
        this.a = a;
        this.b = b;
        this.board = board;
    }

    //winning condition method

    //has to loop until theres a winner
    public void play(){
        System.out.println("\nWelcome to the game of TicTacToe! May the best win");
        while (!winner){




            winner = true;
        }

    }


}
