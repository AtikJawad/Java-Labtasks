package labtask2;

import java.util.*;


public class LabTask2 {

    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("input string-1 (s1)");
        String s1 =sc.nextLine();// Takes string input from user
       
        int length=s1.length();
        System.out.println("Length of the string = "+ length);
        
        System.out.print("ENTER an Index: "); // Printing the character at a given index
        int index=sc.nextInt();
        char character= s1.charAt(index);
        System.out.println("Character at index "+index+" = "+character);
        
        String upper=s1.toUpperCase(); //Making fullstring upper or lower
        System.out.println("uppercase of your string: "+ upper);
        String lower=s1.toLowerCase();
        System.out.println("lowercase of your string: "+ lower);
        
        int start,end; // Displaying Substring
        System.out.print("Enter start and end index for substring: ");
        start=sc.nextInt();end=sc.nextInt();
        String sub=s1.substring(start, end);
        System.out.println("The substring = "+sub);
        
        String trimmed= s1.trim(); //Using trim() to delete leading or trailing whitespaces
        System.out.println("Without Leading or Trailing spaces ="+trimmed);
        
        //Replacing a character with another character 
        System.out.println("Enter the character You wanna Replace: ");
        char c1=sc.next().charAt(0);
        System.out.println("Enter the character to Replace: ");
        char c2=sc.next().charAt(0);
        String replace=s1.replace(c1,c2);
        System.out.println("The new string = "+ replace);
        
        sc.nextLine();// Consume the newline character left by nextInt() and next() before reading the next stringo
        
        System.out.println("Input another String: ");
        String s2 =sc.nextLine();
        
        if(s1.equals(s2)){
            System.out.println("Strings are 100% EQUAL ");
        }
        else if(s1.equalsIgnoreCase(s2)){
        System.out.println("Strings are Equal without cases");
    }
        
        else
            System.out.println("Strings are not Equal!!!!");
        
        
        //Checking for Substring
        if(s1.contains(s2))
            System.out.println(" The string " + s2+ " is found in the string " +s1 );
        else
            System.out.println(" The string " + s2+ " is NOT found in the string " +s1 );
        
        
         //String concatenation using concat() and + operator
     String Concat = s1.concat(s2);
        System.out.println("Concatenation using concat() method: " + Concat);
        
        // Concatenate using + operator
        String PlusOperator = s1 + s2;
        System.out.println("Concatenation using + operator: " + PlusOperator);
        
        // Compare the results
        if (Concat.equals(PlusOperator)){
            System.out.println("Both concatenations give the same result!");
        } 
        else{
            System.out.println("The results are different.");
        }
        
        //Find the First and Last Occurrence of a Character
        
        System.out.print("Enter a character to search: ");
        char ch = sc.next().charAt(0);  // Read the first character of the input
        
        // Find the first occurrence using indexOf()
        int firstOccurrence = s1.indexOf(ch);
        
        // Find the last occurrence using lastIndexOf()
        int lastOccurrence = s1.lastIndexOf(ch);
        
        // Display the results
        if (firstOccurrence == -1) {
            System.out.println("The character '" + ch + "' is not found in the string.");
        } else {
            System.out.println("First occurrence of '" + ch + "' is at index: " + firstOccurrence);
            System.out.println("Last occurrence of '" + ch + "' is at index: " + lastOccurrence);
        }
        
        //Reversing a String using loop
         String reversed = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            reversed += s1.charAt(i); // Append each character in reverse order
        }
         System.out.println("Reversed string using loop: " + reversed);
         
        //Vowel and consonant counter
        int vowelCount = 0;
        int consonantCount = 0;
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
             // Check if the character is a vowel
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
            // Check if the character is a consonant (a letter but not a vowel)
            else{
                consonantCount++;
            }
           
        }
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
        
        //palindrome
        
        if(lower.equals(reversed)){
            System.out.println(s1+" is palindrome");
        }
        
        //Formatted string
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter the number of new messages: ");
        int messageCount = sc.nextInt();
        String formattedString = String.format("Hello, %s! You have %d new messages.", name, messageCount);// Use String.format() to create the formatted string
        System.out.println(formattedString); // Output the formatted string
        
        //
        
    }
    
   
    
    
}
