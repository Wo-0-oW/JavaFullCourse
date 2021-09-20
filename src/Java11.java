import java.util.Scanner;

public class Java11 {
    public static void main(String[] args) {
        //do while and While loop = executes a block of code as long as a it' s  condition remains true

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isBlank()) {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello " + name);

        Scanner scanner1 = new Scanner(System.in);
        String name1 = "";

        do {
            System.out.println("Enter your name: ");
            name1 =scanner1.nextLine();
        }while(name1.isBlank());
        System.out.println("Hello " + name1);


    }

}
