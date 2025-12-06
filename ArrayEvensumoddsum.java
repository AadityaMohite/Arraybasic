
import java.util.*;
public class ArrayEvensumoddsum {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);



           System.out.println("Enter the size of the array: ");
           int n = sc.nextInt();
            
         int arr[] = new int[n];

           System.out.println("Enter the elements of an array: ");
                for (int i = 0; i < arr.length; i++) {
                     arr[i] = sc.nextInt();

                }
               int evensum = 0;
               int oddsum = 0;
                for (int i = 0; i < arr.length; i++) {
                     if (arr[i]%2==0) {
                        evensum = evensum+ arr[i];
                     }else{
                        oddsum  = oddsum + arr[i];
                     }
                }

                System.out.println("Even sum of numbers are: "+evensum);
                System.out.println("Odd sum of number are: "+oddsum);
    }    
}
