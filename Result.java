import java.util.Scanner;
public class Result {
    public static void main(String[] args) {
        Scanner S =  new Scanner(System.in);
        System.out.println("REPORT CARD");
        //System.out.println("STUDENT NAME: ");
        //String Name = S.next();
        System.out.println("Enter Marks in English: ");
        float M1 = S.nextFloat();
        System.out.println("Enter Marks in Maths: ");
        float M2 = S.nextFloat();
        System.out.println("Enter Marks in Hindi: ");
        float M3 = S.nextFloat();
        System.out.println("Enter Marks in Physics: ");
        float M4 = S.nextFloat();
        System.out.println("Enter Marks in Cheistry: ");
        float M5 = S.nextFloat();
        float Result = (M1+M2+M3+M4+M5)/5;
        System.out.println(Result);
        S.close();


    }
}
