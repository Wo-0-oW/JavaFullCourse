import javax.swing.JOptionPane;
public class Java05 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name ");
        //JOptionPane.showMessageDialog(null,"Hello " +name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        //JOptionPane.showMessageDialog(null,"Your are " + age + " years old");

        Double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null,"Your name is " + name +".\n"+ "Your age is " + age+ ".\n" + "Your height is " + height + ".");


    }
}
