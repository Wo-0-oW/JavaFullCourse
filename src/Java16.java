import java.util.Locale;

public class Java16 {
    public static void main(String[] args) {
        //String = a refference data type that can stroe one or more characters
        //           refference data types hav access to useful methods

        String name = "Woo0ooW";

     //   boolean result = name.equalsIgnoreCase("woo");//False
     //    int result = name.length();
     //    char result = name.charAt(0);
     //   int result = name.indexOf("W");
      //      boolean result = name.isEmpty();
       // String result = name.toUpperCase(Locale.ROOT);
      //  String result = name.toLowerCase();
        //  String result = name.trim();
      String result = name.replace('W','B');
        System.out.println(result);
    }
}
