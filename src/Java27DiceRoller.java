import java.util.Random;

public class Java27DiceRoller {

    Random random;
    int number;



    Java27DiceRoller() {
        random = new Random();
        roll();
    }
    void roll(){
        number = random.nextInt(6) +1;
        System.out.println(number);
    }
}
