package labtask3;

import java.util.*;
public class ReplaceSpace {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A String: ");
        String s1= sc.nextLine();
        
        System.out.println("Character to insert at space ");
        char ch= sc.next().charAt(0);
     String replace=s1.replace(' ', ch);
        System.out.println(replace);
    }
}
