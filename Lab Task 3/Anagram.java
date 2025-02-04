
package labtask3;

import java.util.*;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);        
        System.out.println("Enter a string:");
        String s1=sc.nextLine();
        
        System.out.println("Enter 2nd string:");
        String s2=sc.nextLine();
        
       char[] arr1=s1.toCharArray();
        Arrays.sort(arr1);
                
        //Anagrams
        char[] arr2=s2.toCharArray();
       Arrays.sort(arr2);
       
       boolean anagram= Arrays.equals(arr1, arr2);
       
       if(anagram){
           System.out.println("Anagram");
       }
       else{
           System.out.println("NOT Anagram");
       }
            }
}
