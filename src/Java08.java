public class Java08 {
    public static void main(String[] args) {
        //If statment = performs a block of code if it's condition evaluates to be true

        int age = 18;

        if (age >= 75) {
            System.out.println("Ok Boomer!");
        } else if (age >= 18) {
            System.out.println("You are an adult!");
        } else if(age>=13) {
            System.out.println("You are a teenager!");
        }else {
            System.out.println("You are not an adult!");
        }
    }
}
