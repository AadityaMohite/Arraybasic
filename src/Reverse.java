import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of an array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the Elements of an array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Before reverse array will be: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Orignal array: "+ arr[i]);
        }

        reversearr(arr);



    }

    static void reversearr(int[] arr){
        int start = 0;
        int end = arr.length-1;

        for (int i = 0; i < arr.length; i++) {
            if(end>start){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }

        System.out.println("After the reverse array will be: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}
