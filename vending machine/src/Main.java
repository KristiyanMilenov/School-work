import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
  Scanner reader = new Scanner(System.in);
  double p1 = 1.50;
  double p2 = 1.25;
  double p3 = 0.75;
  double p4 = 1.00;
       System.out.println("Choose a product: ");
       String choice = reader.nextLine();
       switch(choice){
           case "A1":
               if (choice.equals("A1")){
                   System.out.println("Soda - Price: $"+p1);
               }
               break;
           case "B2":
                if (choice.equals("B2")){
                   System.out.println("Chips - Price: $"+p2);
               }
                break;
           case "C3":
                if (choice.equals("C3")){
                   System.out.println("Candy - Price: $"+p3);
               }
               break;
           case "D4":
                if (choice.equals("D4")){
                   System.out.println("Water - Price: $"+p4);
               }
           default:
               System.out.println("Error - Product not available");


       }
   }
}
