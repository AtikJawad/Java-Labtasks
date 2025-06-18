import java.util.Scanner;

public class LabTask2 {    
    
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert to lowercase
        input = input.toLowerCase();

        // Convert string to char array
        char[] chars = input.toCharArray();
        boolean[] counted = new boolean[chars.length]; //Keeps track of which characters have been counted already.

        System.out.println("\nCharacter Frequency Table:");
        System.out.println("--------------------------");
        System.out.printf("%s\t %s \n", "Character", "Count");
        System.out.println("--------------------------");

        for (int i = 0; i < chars.length; i++) {
            if (!counted[i]) {
                int count = 1;
                for (int j = i + 1; j < chars.length; j++) { /*Starts from the next character (i + 1)
                                                             and compares every other character with chars[i].*/
                    if (chars[i] == chars[j]) {
                        count++;
                        counted[j] = true; // Mark as counted
                    }
                }
                System.out.printf("%s\t%10d\n", chars[i], count);
            }
        }
    }
    
}
