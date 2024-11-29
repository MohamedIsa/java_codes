import java.util.Scanner;
public class SumNum
 {
    public int sumUntil(int num) {
        if (num == 1) {
            return 1;
           } else 
              return num + sumUntil(num-1);
    }
      
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to sum all  numbers between 1 and the number (inclusive):");
        int num = sc.nextInt();

        if (num < 1) {
            System.out.println("Please enter a number greater than or equal to 1.");
        } else {
        SumNum obj=new SumNum();
            System.out.println("the sum of Numbers between 1 and " + num + ":");
            System.out.println(obj.sumUntil(num));
        }
    }}
