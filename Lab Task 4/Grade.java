
package labtask4;

import java.util.*;

class Grade{
        private String name;
        private int roll;
        private double marks[];
        private double grade;

    public Grade(String name, int roll, double[] marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
        this.grade = Grade_Calculation();
    }
    public double Grade_Calculation(){
        
       double sum=0;
       for(double mark:marks){
           sum+=mark;
       }
       double average =sum/marks.length;
       
      if(average>=80 && average<=100) return 4.00;
           
      else if(average>=75 && average<=79) return 3.75;
           
      else if(average>=70 && average<=74)  return 3.50;
      
      else if(average>=65 && average<=69)return 3.25;
      
      else if(average>=60 && average<=64)return 3.00;
     
      else if(average>=50 && average<=59)return 2.75;
      
      
      else if(average>=40&& average<=49)return 2.50;
            
      else return 0.00;       
              
    }
    
    public void ShowData(){
        System.out.println("Name: "+ name +"\t"+ "Roll: "+roll+"\t" );
        System.out.print("Marks[ ");
        for(double mark:marks){
            System.out.print(mark+" ");
        }
        System.out.println("]");
        
        System.out.print("Grade:  "+ grade);
    }       

}

public class gradeTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter Total Students: ");
        int n=sc.nextInt();
        Grade student[]=new Grade[n];
        
        System.out.print("Enter Total Courses: ");
        int c=sc.nextInt();       
        
        sc.nextLine();
        
        for(int i=0;i<n;i++){
            System.out.println("-------Enter details of Student- "+(i+1)+" -------");
            
            System.out.print("Name: "); String name=sc.nextLine();
            
            System.out.print("Roll: "); int roll=sc.nextInt();
            
            
            
            double marks[]=new double[c];
            System.out.println("----- Enter Marks -----");
            
            for(int j=0; j<c ;j++){
                System.out.print("Enter Mark of Course " + (j + 1) + ": ");
                marks[j]=sc.nextDouble();
            }
            sc.nextLine();
            
            student[i]=new Grade(name,roll,marks);
        
        }
        
        System.out.println("\nStudent Data:");
        for(Grade s:student){
            s.ShowData();
            System.out.println("\n---------------------------------");
        }
        sc.close();
   
        
    }
    
}
