import java.util.*;

public class Input {
    private Scanner input_gather = new Scanner(System.in);
    private ArrayList<Proposition> input_propositions;

    public void gather(){
        gather_propositions();
    }

    private void gather_propositions(){
        print_menu();
        while(input_gather.nextLine() != "quit"){

        }
    }

    private void print_menu(){
        System.out.println("enter propositions each on a new line");
        System.out.println("type quit");
    }
}
