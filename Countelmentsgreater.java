import java.util.Scanner;

public class Countelmentsgreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of an array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target element that can be searched to be greater  in array: ");
        int target = sc.nextInt();

        int result = count(arr,target);
        System.out.println("Result is: "+result);

    }
    static int count(int[]arr,int target){
     int count = 0;
        for (int i = 0; i < arr.length; i++) {
              if(arr[i]>target){
                     count++;
              }
        }
        return  count;
    }
}
