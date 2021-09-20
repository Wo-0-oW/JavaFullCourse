import java.util.Scanner;

public class Java06 {
    public static void main(String[] args) {
        double x = 3.14;
        double y = -10;

        double z = Math.max(x, y);
        System.out.println(z);

        double t = Math.min(x, y);
        System.out.println(t);

        double a = Math.abs(y);
        double b = Math.abs(x);
        double c = Math.sqrt(x);
        double d = Math.round(x);
        double e = Math.ceil(a);
        double f;
        double g;
        double h;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side f: ");
        f= scanner.nextDouble();
        g= scanner.nextDouble();


        h = Math.sqrt((f*f)+(g*g));
        System.out.println(h);



    }
}
