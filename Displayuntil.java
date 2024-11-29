import java.util.Scanner;
public class Displayuntil
 {
    public void displayNumbersUntil(int num) {
        if (num == 1) {
            System.out.print(1 + " ");
        } else if (num > 1) {
            displayNumbersUntil(num - 1); // Recursive call for smaller number
            System.out.print(num + " "); // Display the current number after the recursive call
        }
    }
      
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to display all numbers between 1 and the number (inclusive):");
        int num = sc.nextInt();

        if (num < 1) {
            System.out.println("Please enter a number greater than or equal to 1.");
        } else {
            Displayuntil obj = new Displayuntil();
            System.out.println("Numbers between 1 and " + num + ":");
            obj.displayNumbersUntil(num);
        }
    }}
