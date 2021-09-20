public class Java29Main {

    public static void main(String[] args) {


        // toString() = special method that all objects inherit, that returns a string that "textually represents" an object. can be used both implicitly and explicitly

        Java29Car car = new Java29Car();


        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.color);
        System.out.println(car.year);
        System.out.println(car);
        System.out.println(car.toString());
        System.out.println(car);


    }
}