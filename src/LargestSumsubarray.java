import java.util.Scanner;

public class LargestSumsubarray {
    public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
          int[] arr = new int[n];

        System.out.println("Enter the elements of an array");
        for (int i = 0; i < arr.length ; i++) {
              arr[i] = sc.nextInt();
        }

        System.out.println("Enter the size of the sliding window");
        int k = sc.nextInt();

        int result = Largestsum(arr,k);

        System.out.println("Maximum size of an "+k+" Sum is "+result);

    }

    static int Largestsum(int[] arr,int k){

        int windowsum = 0;
        for (int i = 0; i < k; i++) {
              windowsum = windowsum+arr[i];
        }
         int sum = windowsum;

        for (int i = k; i <arr.length ; i++) {
            windowsum = windowsum - arr[i-k]+arr[i];
             sum = Math.max(sum,windowsum);
        }

        return  sum;
    }
}
