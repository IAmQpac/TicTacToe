public class Driver {
    public static void main(String[] args) {
        System.out.println("Welcome to the game of TicTacToe");
        Player player1 = new Player();
        Player player2 = new Player(player1);

        Board b = new Board();
        b.printBoard();

        Game game = new Game(player1, player2, b);
        game.play();



    }
}
