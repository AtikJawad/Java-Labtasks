
package labtask3;

import java.util.*;


public class longestWord {
      
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String A = scan.nextLine();
        String[] word = A.split(" ");
        String longestWord = "" ;
        int maxLength =0;
        for(String w : word){
            if(w.length()>maxLength){
                longestWord =w;
                maxLength =w.length();
            }
        }
        System.out.println("The longest word is : - " + longestWord);
    }
}

