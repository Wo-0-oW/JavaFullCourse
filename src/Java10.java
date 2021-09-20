import java.util.Scanner;

public class Java10 {
    public static void main(String[] args) {
        //Logical operators = used to connect two or more expressions
        //                      && = (AND) both conditions must be true
        //                      || = (OR) either condition must be true
        //                      !  = (NOT) reverses boolena value of condition

        int temp = 15;

        if (temp > 30) {
            System.out.println("It is hot outside");
        } else if (temp >= 20 && temp <= 30) {
            System.out.println("It is warm outside");
        } else {
            System.out.println("It is cold outside");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner.next();

        if (response.equals("q") || response.equals("Q")) {
            System.out.println("You quit the game");
        } else {
            System.out.println("You are still playing the game");
        }
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Are you insane? (Y/N)");
        String response2 = scanner1.next();

        if (!response2.equals("y") && !response2.equals("Y")) {
            System.out.println("You are not Insane.");
        } else if (!response2.equals("n") && !response2.equals("N")) {
            System.out.println("You are Insane.");
        } else {
            System.out.println("Please, Just Y or N input the console. You was diffirent word input the console");
        }


    }
}
