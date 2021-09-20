import java.util.ArrayList;

public class Java20 {
    public static void main(String[] args) {
        //for-each = traversing technique to iterate through the elemnts in an array/collection
        //          less steps, more readable
        //             less flexible

        //String[] animals = {"cat","dog","rat","bird"};

        ArrayList<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");

        for (String i : animals) {
            System.out.println(i);
        }
    }
}
