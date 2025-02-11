
package labtask4;

import java.util.*;

class Triangle{
private double height;
private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public Triangle() {
        height=0;
        base=0;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }

    public void setBase(double base) {
        this.base = base;
    }
     
    public double getBase() {
        return base;
    }
    
    public double getArea(){
     
        return 0.5*height*base;
}
}    
public class triangleTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the height & base: ");
        double height=sc.nextDouble();
        double base=sc.nextDouble();
        
        Triangle Tr=new Triangle(height,base);
        System.out.println("Area of the Triangle = " + Tr.getArea());
            
        }
    
}
