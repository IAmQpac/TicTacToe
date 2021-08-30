import java.util.Scanner;

public class Player {
    private char input;
    private String name;

    public Player() {
        askName();
        askInput();
    }
    public Player(Player player1) {
        askName();
        if (player1.getInput() == 'X'){
            setInput('O');
            System.out.println(getName() + " will represent O's");
        }else{
            setInput('X');
            System.out.println(getName() + " will represent X's");
        }
    }

    private void askName(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name of the player: ");
        name = in.nextLine();
    }

    private void askInput(){
        Scanner in = new Scanner(System.in);
        System.out.print("Would you like to represent X or O: ");
        String x = in.nextLine();
        if (x.equalsIgnoreCase("x")){
            input = 'X';
        }
        else if (x.equalsIgnoreCase("O")){
            input = 'O';
        }
        else {
            System.out.println("Wrong input");
            askInput();
        }
    }


    public String askPlayerCellInput(){
        Scanner in = new Scanner(System.in);
        System.out.println(this.name + ", where do you want to write an " + input);
        return in.nextLine();
    }

    public char getInput() {
        return input;
    }

    public void setInput(char input) {
        this.input = input;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
