import javax.swing.JOptionPane;

public class guiapp {
   public static void main(String args[]) {
      String name = JOptionPane.showInputDialog("Enter your name");
      JOptionPane.showMessageDialog(null, "Hello" +name);

      int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
      JOptionPane.showMessageDialog(null, "you are "+age +" year old");

      double height = Double.parseDouble(JOptionPane.showInputDialog("Enter you height "));
      JOptionPane.showMessageDialog(null, "my height is "+height+" cm");
   }
}