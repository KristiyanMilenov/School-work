import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a category(History,Science,Sports): ");
        String choice = reader.nextLine();
        switch (choice) {
            case "History":
                String a1;
                if (choice.equals("History")) {
                    System.out.println("When did WW1 start?");
                    a1 = reader.nextLine();

                    if (a1.equals("1914")) {
                        System.out.println("Correct! + 1 point");
                    } else {
                        System.out.println("Incorect. the correct answer is 1914");
                    }
                }
            case "Science":
              String a2;
                if (choice.equals("Science")) {
                    System.out.println("What do you get when you mix hydrogen and oxygen");
                    a2 = reader.nextLine();

                    if (a2.equals("water")) {
                        System.out.println("Correct! + 1 point");
                    } else {
                        System.out.println("Incorect. the correct answer is water");
                    }
                }
            case "Sports":
                String a3;
                if (choice.equals("Sports")) {
                    System.out.println("Who won the 2024 euros");
                    a3 = reader.nextLine();

                    if (a3.equals("Spain")) {
                        System.out.println("Correct! + 1 point");
                    } else {
                        System.out.println("Incorect. the correct answer is Spain");
                    }
                }
            default:
                System.out.println("Invalid category choice");
        }
    }
}