import java.util.Scanner;

public class Maxval {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of an array");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        max(arr);


    }

    static void max(int[] arr){
              int max = arr[0];

              for (int i = 0; i< arr.length; i++){
                  if(arr[i]>max){
                       max = arr[i];
                  }
              }

        System.out.println("Maximum value of an array: "+ max);

    }
}
