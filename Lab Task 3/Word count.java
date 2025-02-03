package labtask3;
import java.util.*;
public class WordCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter A String: ");
        String s1= sc.nextLine();
        String word[]= s1.split("\\s");
        System.out.println("Your string has "+ word.length + " words");
    }
         
}
