
package labtask3;

import java.util.*;
import java.util.Arrays;
public class Capitalize {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter A String: ");
        String s1= sc.nextLine();
        String word[]= s1.split("\\s");
        
        for(String i:word){
            System.out.println(i.substring(0, 1).toUpperCase() + i.substring(1));
            
        }
    }
    
}
