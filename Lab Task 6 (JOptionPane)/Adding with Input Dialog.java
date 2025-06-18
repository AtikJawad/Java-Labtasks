import java.util.*;
import javax.swing.*;
public class LabTask6 {

    
    public static void main(String[] args) {
        
        int input1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input 1st integer"));
        int input2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input 2nd integer"));            
        
        int sum = input1+input2;
        JOptionPane.showMessageDialog(null, "Sum= "+sum,"Sum of the inputs",JOptionPane.INFORMATION_MESSAGE);
             
    } }
