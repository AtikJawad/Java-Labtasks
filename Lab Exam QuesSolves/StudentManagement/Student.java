
package labxm;


public class Student {
    private String name;
    private int roll;
    private double AttendancePercentage;
    private char grade;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public double getAttendancePercentage() {
        return AttendancePercentage;
    }

    public char getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAttendancePercentage(double AttendancePercentage) {
        
        if(AttendancePercentage<0||AttendancePercentage>100){
            System.out.println("Invalid Attendance Percentage");
        }
        this.AttendancePercentage = AttendancePercentage;
    }

    public void setGrade(char grade) {
        if(grade >= 'A' && grade <= 'F'){
        this.grade = grade;}
        else
            System.out.println("Invalid Grade");
    }
    
    
    public void ShowDetail(){
        System.out.println("Name: "+name );
        System.out.println("Roll: "+roll );
        System.out.println("Attendance: "+AttendancePercentage+"%" );
        System.out.println("Grade: "+grade );
    }
    
    }
    
    
    
    

