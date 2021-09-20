public class Java26Main {
    public static void main(String[] args) {
        Java26Human human = new Java26Human("Adem",34,70);
        Java26Human human2 = new Java26Human("Ali",27,84);
        Java26Human human3 = new Java26Human("Meltem",33,60);

        System.out.print("Isim  "+"Yas  "+"Kilo \n");
        System.out.print(human.name+" ");
        System.out.print(human.age);
        System.out.print(human.weight+" ");
        System.out.print(human2.name+" ");
        System.out.print(human2.age+" ");
        System.out.print(human2.weight+" \n");
        System.out.print(human3.name+" ");
        System.out.print(human3.age+" ");
        System.out.print(human3.weight+" ");


        human2.eat();
        human.drink();


    }
}
