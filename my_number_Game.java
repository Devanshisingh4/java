import java.util.Scanner;
import java.util.Random;

class mygame{
    int User_num;
    int com_num;
    static int noofGuess = 0;

    
     mygame(){
        Random r = new Random();
        com_num = r.nextInt(101);
    }
     
    public void Startgame(){
        Scanner sc = new Scanner(System.in);
        boolean isCorrectnum = false;
        while(!isCorrectnum){
        
        System.out.println("Let start the Game....");
        System.out.println("Enter your number: ");
        User_num = sc.nextInt();

        
        if(User_num> com_num){
            System.out.println("Your number is greater.");
            noofGuess=noofGuess + 1;
            
        }
        else if ( User_num == com_num){
            System.out.println("You gussed it right.");
            isCorrectnum = true;
            noofGuess ++;
            
        }
        else{
            System.out.println("Your number is smaller.");
            noofGuess += 1 ;
            
        }
            
        
}
}


public class my_number_Game {
   public static void main(String[] args) {
    mygame mg = new mygame();
    mg.Startgame();
    System.out.println("no of gusses :" + noofGuess);

   }
   
}
}

