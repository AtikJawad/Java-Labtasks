
import java.util.*;
import javax.swing.*;
public class LabTask6 {

    
   public static void main(String[] args) {
       
        int breadth = Integer.parseInt(JOptionPane.showInputDialog("Enter the breadth of the rectangle:"));
        int height = Integer.parseInt(JOptionPane.showInputDialog("Enter the height of the rectangle:"));
        
        int area = breadth * height;
        JOptionPane.showMessageDialog(null, "Area of rectangle = " + area);

    }
    
}
