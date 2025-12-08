package LogicBuilding;
import java.util.Scanner;

public class maxandmin {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the Size of array");
        int num = sc.nextInt();
         
        int[] arr = new int[num];

        System.out.println("Enter the Elements of array");
        for (int i = 0; i < num; i++) {
              arr[i] = sc.nextInt();
        }
       
        int max = arr[0];
        int min = arr[0];
        
       
        for (int i = 0; i < arr.length; i++) {
              if (arr[i] > max) {
                    max = arr[i];
              }
        }

        
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        
        System.out.println("Maximum number of array is : " + max); 
        System.out.println("Minimum number of array is : " + min);
    }
}
