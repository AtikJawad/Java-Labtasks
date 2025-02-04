
package labtask3;

import java.util.*;
import java.util.Arrays;

public class SortedString {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A String: ");
        String s1= sc.nextLine();
        
        char arr1[] = s1.toCharArray();
        Arrays.sort(arr1);
        System.out.println(arr1);
    }
    
}
