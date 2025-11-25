import java.util.Arrays;
import java.util.Scanner;

public class Swappingarray {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of an array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the index1 of array that can be swap");
        int index1 = sc.nextInt();

        System.out.println("Enter the index2 of array that can be swap");
        int index2 = sc.nextInt();


         swap(arr,index1,index2);

        System.out.println(Arrays.toString(arr));


    }
    static void swap(int arr[], int index1,int index2){
           int temp ;
           temp = arr[index1];
           arr[index1] = arr[index2];
           arr[index2] = temp;
    }
}
