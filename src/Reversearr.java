import java.util.Scanner;

public class Reversearr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of an array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Orignal array will be");

        for(int x : arr){
            System.out.println(x);
        }

        Reversearray(arr);


    }

    static  void Reversearray(int[] arr){
           int start = 0;
           int end = arr.length-1;

           while(start<end){
               int temp = arr[start];
               arr[start] = arr[end];
               arr[end] = temp;

               start++;
               end--;
           }

        System.out.println("After the reverse of array will be: ");
           for (int x : arr){
               System.out.println(x);
           }
    }
}
