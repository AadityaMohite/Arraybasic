import java.util.Arrays;
import java.util.Scanner;

public class Sortingapproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of an array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target element that can be searched greater then array");
        int target = sc.nextInt();

        int result = Count(arr,target);
        System.out.println("Result is: "+result);
    }

     static  int Count(int[] arr,int target){

         Arrays.sort(arr);
        int count = 0;
         for (int i = 0; i < arr.length; i++) {
               if (arr[i]>target){
                    return arr.length - i;
               }
         }

        return  0;
     }

}
