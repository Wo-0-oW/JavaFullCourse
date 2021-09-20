import java.util.ArrayList;

public class Java18 {
    public static void main(String[] args) {
        //ArrayList = a resizable array
        //              Elemnts can be added and removed after compilation phase
        //              store refernce data types

        ArrayList<String> food = new ArrayList<>();

        food.add("Pizza");
        food.add("Hamburger");
        food.add("Lahmacun");
        food.add("Kebap");

        food.set(0,"Doner");
        food.remove(2);
        //food.clear();


        for (int i=0; i<food.size(); i++) {
            System.out.println(food.get(i));
        }


    }
}
