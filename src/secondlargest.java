package LogicBuilding;
import java.util.Scanner;
public class secondlargest {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          System.out.println("Enter the Size of array");
          int num = sc.nextInt();

          int[] arr = new int[num] ;

          System.out.println("Enter the Elements of array");
          for (int i = 0; i < num; i++) {
               arr[i] = sc.nextInt();
          }

          int largestnumber = 0;
          int secondlargest = 0;

          for(int value : arr){
                if (value >largestnumber) {
                     secondlargest = largestnumber;
                     largestnumber = value;
                }else if(value >secondlargest && value!= largestnumber){
                     secondlargest = value;
                }
          }
          System.out.println("SecondLargest Number is: "+secondlargest);
          System.out.println("Largest Number of Array is:"+largestnumber);


    }
}
