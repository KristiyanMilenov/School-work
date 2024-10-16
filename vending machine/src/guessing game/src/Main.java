import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
  Scanner reader = new Scanner(System.in);
   int n1 = 5;
       System.out.println("Guess a number between 1 and 10: ");
       int g1 = reader.nextInt();
       if (g1<5){
           System.out.println("Guess higher");
       }
       else if (g1>5) {
           System.out.println("Guess lower");
       }
       else if (g1 == 5) {
           System.out.println("You win");
       }




       System.out.println("Guess a number between 1 and 10: ");
       int g2 = reader.nextInt();
       if (g2 <5){
           System.out.println("Guess higher");
       }
       else if (g2 >5) {
           System.out.println("Guess lower");
       }
       else if (g2 == 5) {
           System.out.println("You win");
       }


       System.out.println("Guess a number between 1 and 10: ");
       int g3 = reader.nextInt();
       if (g3 <5){
           System.out.println("You lose");
       }
       else if (g3 >5) {
           System.out.println("You lose");
       }
       else if (g3 == 5) {
           System.out.println("You win");
       }
   }
}
