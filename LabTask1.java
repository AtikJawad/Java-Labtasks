package labtask1;

import java.util.*;

public class LabTask1 {

    
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
        System.out.print("Enter 2 integers a & b:");
        
        int a= sc.nextInt(); int b= sc.nextInt();
        
        System.out.println("Max among the 2 integers " + a +" & " +b+ " is " + Math.max(a, b)  ); // Used Math.max()
         System.out.println("Minimum among the 2 integers " + a +" & " +b+ " is " + Math.min(a, b)  ); //Used Math.min()
         
        System.out.println("The Absolute value of "+ a+" is " + Math.abs(a)); // used Math.abs()
        
        System.out.println("The Square root of "+ b+ " is " +  Math.sqrt(b) ); // use of Math.sqrt()
        
        System.out.println("integer a to the power b is " + Math.pow(a, b)); // Used Math.pow()
        
        System.out.print("Enter Float number c:");
        double c= sc.nextDouble();
        System.out.println("Round of c = "+Math.round(c)+ "\n" + "Ceil of c= "+Math.ceil(c)+ "\n" + "Floor of c = " + Math.floor(c)); // Used Math.round(), Math.ceil(), Math.floor()
        
        System.out.println("Generating 10 Random numbers:");
        for(int i=1;i<=10;i++){
            System.out.println(i+ ". "+ Math.round(100*Math.random())); // Used Math.random()
        }
        
        System.out.println("Enter an Angle (in Degree)");
        double angle = sc.nextDouble();
        System.out.println("sine= "+Math.sin(Math.toRadians(angle)));
        System.out.println("cosine= "+Math.cos(Math.toRadians(angle)));
        System.out.println("tangent= "+Math.tan(Math.toRadians(angle))); // Used Trigonometric math functions
        
        System.out.println("Natural logarithm= " + Math.log(c)+ " base-10 logarithm= "+ Math.log10(c)); // Use of logarithmic functions
        
        System.out.println("value of Exponential growth(e^c)= " + Math.exp(c)); //Use of Exponential function
        
        System.out.println("Hypotenuse Calculation = "+ Math.hypot(a, b)); //Use of Math.hypot()
        
        System.out.println("Area of a Circle= "+ Math.PI*c*c + " & Circumference= " + 2*Math.PI*c); // Used Math.PI
        
         double discriminant = Math.pow(b, 2) - (4 * a * c);
        if (discriminant > 0) {
            // Two real roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are real and different.");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (discriminant == 0) {
            // One real root
            double root = -b / (2 * a);
            System.out.println("The root is real and the same.");
            System.out.println("Root = " + root);
        } else {
            // Complex roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("The roots are complex and different.");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i"); // Solved quadratic eqns using Math.sqrt() and Math.pow()
        }
  
        System.out.println("Enter an Angle (in Radians)");
        double angle2 = sc.nextDouble();   
        System.out.println("Degree to Radian= " + Math.toRadians(angle));
        System.out.println("Radian to Degree = " + Math.toDegrees(angle2)); //converts an angle from degrees to radians and vice-versa
        
        //Random number generator from a given range
         System.out.println("ENter range Minimum & Maximum:");
         int min = sc.nextInt(); int max = sc.nextInt();
         
          if (min > max) {
            System.out.println("Invalid range! The minimum value must be less than or equal to the maximum value.");
        } else {
            
            int randomNumber = min+ (int)(Math.random() * (max - min + 1));
            System.out.println("Random number between " + min + " and " + max + ": " + randomNumber);
        }
        
        System.out.println("Enter x1,y1,x2,y2");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        System.out.println("The Euclidean distance between the points ("+ x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is: " + Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2)));
        //Euclidean distance

        int totalRolls =1000;
        int [] sumcounts = new int [13];
        
        for(int i=0;i<totalRolls;i++){
            
            int dice1= (int)(Math.random()*6)+1;
            int dice2= (int)(Math.random()*6)+1;
            int sum = dice1+dice2;
            sumcounts[sum]++;
            }
        for(int sum=2;sum<=12;sum++){
            double percentage= (sumcounts[sum]*100)/totalRolls;
            
            System.out.printf("%d \t %.2f\n", sum, percentage);
        } //Simulating Dice Rolls
        
        
     
     
        
    }
    
}
