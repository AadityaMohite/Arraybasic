import java.util.Scanner;

public class Findthenumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
          int n = sc.nextInt();
         int[] arr = new int[n];
        System.out.println("Enter the elements of an array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target element");
        int target = sc.nextInt();
        
        int result = find(arr,target);

        System.out.println("Reult: "+result);

    }
    
    static  int find(int[] arr, int target){
         int count =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>target){
                 count++;
            }
        }





        return count;
    }
}

