import java.util.Scanner;

public class removeElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array ");
        int n = sc.nextInt();
         int[] arr = new int[n];
        System.out.println("Enter the elements of an array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target elemnt");
        int target = sc.nextInt();


        int result = remove(arr,target);
        System.out.println("Result : "+result);
    }

       static  int remove(int[] arr,int target){

        int j =0;

           for (int i = 0; i < arr.length; i++) {
               if (arr[i]!=target){
                   arr[j] = arr[i];
                   j++;
               }
           }

        return j ;
       }
}
