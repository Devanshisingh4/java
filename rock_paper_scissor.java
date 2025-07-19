import java.util.Scanner;
import java.util.Random;

public class rock_paper_scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int computer_choice = rd.nextInt(3);
        System.out.println("Lets start the game");
        System.out.println("its your turn ");
        System.out.println("0.ROCK");
        System.out.println("1.PAPER");
        System.out.println("2.SCISSOR");
        System.out.print("Please enter your choice(in number 0 or 1 or 2): ");
        int choice = sc.nextInt();
        if(choice<3){
            System.out.print("");
        }
        else {
            System.out.println("Invalid choice");
            return;
        }
       
        if(choice == computer_choice){
            System.out.println("Its a draw");
        }
        else if(choice==0 && computer_choice==2||choice==1 && computer_choice==0|| choice==2 && computer_choice==1||choice==2&&computer_choice==1){
            System.out.println("You win");
        }
        else{
            System.out.println("Computer win");
        }
       
        
        System.out.println("computer chooses: " +computer_choice);

        
        
            
        }
    }

