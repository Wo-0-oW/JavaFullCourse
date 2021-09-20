import java.util.ArrayList;

public class Java19 {
    public static void main(String[] args) {
        //2D ArrayList = a dynamic list of lsits
        // You can change the size of thes lists during runtime

       ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("Pasta");
        bakeryList.add("Garlic bread");
        bakeryList.add("Donuts");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("Tomatoes");
        produceList.add("Zucchini");
        produceList.add("Peppers");

        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("Soda");
        drinkList.add("Coffe");
      //  bakeryList.add("Cola");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinkList);

        System.out.println(groceryList.get(0).get(1));

    }
}
