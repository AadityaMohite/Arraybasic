import java.util.Scanner;

public class CountEvenandodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an Number ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the Elements of an array");
        for (int i = 0; i < arr.length; i++) {
              arr[i] = sc.nextInt();
        }

        int result = Count(arr);

        System.out.println("Even Count is : "+result);


    }
    static  int Count(int[] arr) {
        int evencount = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                evencount++;
            }
        }

        return evencount;
    }

}
