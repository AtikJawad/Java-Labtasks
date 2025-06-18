import java.util.*;
import javax.swing.*;
public class LabPractice {

    
    public static void main(String[] args) {
        
        int Radius = Integer.parseInt(JOptionPane.showInputDialog(null, "Input the radius of Circle:"));  
        
                
        double Area = Math.PI*Math.pow(Radius, Radius);
        double Circumference =2*Math.PI*Radius;
        
       String result = String.format("Circumference = %.2f units \nArea = %.2f Square units", Circumference, Area);
       JOptionPane.showMessageDialog(null,result);
     
        
    }
    
}
