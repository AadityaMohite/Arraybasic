import java.util.Scanner;

public class GreaterElementusingBinarysearch {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elemnts of an array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target element that can be search Greater in array:");
        int target = sc.nextInt();

        int result = Count(arr,target);
        System.out.println("result is: "+result);
    }

      static  int Count(int[]arr,int target){

        int start =0;
        int end = arr.length-1;
        int ans = arr.length;

        while(start<=end){

            int mid = (start+end)/2;

            if(arr[mid]>target){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }

        }


        return arr.length - ans;
      }

}
