import java.util.Scanner;

public class DisplayOdd {
    public void displayOddNumbersUntil(int num) {
        if (num == 1) {
            System.out.print(1 + " ");
        } else if (num % 2 == 1) {
            displayOddNumbersUntil(num - 1);
            System.out.print(num + " ");
        } else
            displayOddNumbersUntil(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to display all odd numbers between 1 and the number (inclusive):");
        int num = sc.nextInt();

        if (num < 1) {
            System.out.println("Please enter a number greater than or equal to 1.");
        } else {
            DisplayOdd obj = new DisplayOdd();
            System.out.println("Numbers between 1 and " + num + ":");
            obj.displayOddNumbersUntil(num);
        }
    }
}
