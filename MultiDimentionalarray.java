import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MultiDimentionalarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the size of the Row");
        int row = sc.nextInt();

        System.out.println("Enter the size of the columns");
        int column = sc.nextInt();

        int[][] arr = new int[row][column];

        System.out.println("Enter the elements of an array");
        for (int ro = 0;  ro<arr.length ; ro++) {

            for (int co = 0; co < arr[ro].length; co++) {

                    arr[ro][co] = sc.nextInt();

            }

        }

        for (int ro = 0; ro < arr.length; ro++) {

            for (int co = 0; co < arr[ro].length; co++) {
                System.out.print(arr[ro][co]+ " ");
            }

            System.out.println();
        }





    }
}