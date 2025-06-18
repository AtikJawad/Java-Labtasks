
package labxm;

import java.util.*;

public class LabXM {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Array element? ");
        int n=sc.nextInt();
        
        int[] arr= new int[n];
        System.out.println("Enter array elements :");
        
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();  }
                    
        try{
            int index=sc.nextInt();
                      
            System.out.println("Element at index "+index+": "+arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ERROR:Index Out of Bounds");}
        catch(NumberFormatException e){
             System.out.println("Invalid Input.Please enter a numeric value");
        }
        catch(InputMismatchException e){
             System.out.println("Invalid Input.Please enter a numeric value");
             sc.next();
        }
        
      
}}
