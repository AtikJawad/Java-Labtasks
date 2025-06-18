import javax.swing.JOptionPane;

public class LabTask6 {
    public static void main(String[] args) {
        String aStr = JOptionPane.showInputDialog("Enter length of side a:");
        String bStr = JOptionPane.showInputDialog("Enter length of side b:");
        String cStr = JOptionPane.showInputDialog("Enter length of side c:");
        
        double a = Double.parseDouble(aStr);
        double b = Double.parseDouble(bStr);
        double c = Double.parseDouble(cStr);
        
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        
        JOptionPane.showMessageDialog(null, "The area of the triangle is: " + area);
    }
}
