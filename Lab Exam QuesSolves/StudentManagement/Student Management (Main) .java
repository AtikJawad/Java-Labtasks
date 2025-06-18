
package labxm;

import java.util.*;


public class LabXM {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student[] students = new Student[3];

        students[0] = new Student("Alice", 101);
        students[0].setAttendancePercentage(88);
        students[0].setGrade('B');

        students[1] = new Student("Atik", 102);
        students[1].setAttendancePercentage(76);
        students[1].setGrade('C');

        students[2] = new Student("David", 103);
        students[2].setAttendancePercentage(92);
        students[2].setGrade('A');
        
      
                                 
        
        System.out.println("----------Student details----------");
        for(Student s: students){
            s.ShowDetail();
            System.out.println("-----------------------------");
        }
        
        // Update Alice's attendance and grade
        students[0].setAttendancePercentage(90);
        students[0].setGrade('A');
        //Update Atik's attendance and grade
        students[1].setAttendancePercentage(60);
        students[1].setGrade('D');
        
      System.out.println("-----Student details After Updating-----");
        for(Student s: students){
            s.ShowDetail();
            System.out.println("-----------------------------");
        }
}}
