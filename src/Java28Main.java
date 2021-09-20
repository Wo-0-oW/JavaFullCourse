public class Java28Main {
    public static void main(String[] args) {

        //Overloaded constructors = multiple constructors within a class with the same name. but have different parameters name + parameters = signature

        Java28Pizza pizza = new Java28Pizza("thicc crust", "tomato", "mozzerella","pepperoni");
        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.cheese);
        System.out.println(pizza.sauce);
        System.out.println(pizza.bread);
        System.out.println(pizza.topping);


    }
}
