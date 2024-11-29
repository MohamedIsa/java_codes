import java.util.Scanner;
public class EvenSquareProduct {

    // Recursive method to calculate the product of squares of even numbers between start and end
    public static int evensquare2(int start, int end) {
        if (start > end) {
            return 1; // Base case: if start exceeds end, return 1 (neutral for multiplication)
        }
        if (start % 2 == 0) {
            // If the current start is even, include its square in the product
            return (start * start) * evensquare2(start + 1, end);
        } else {
            // If the current start is odd, skip it
            return evensquare2(start + 1, end);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the start number and end number");
        int start=sc.nextInt();
        int end=sc.nextInt();
        int result = evensquare2(start, end);
        System.out.println("Result for start = " + start + ", end = " + end + ": " + result);
    }
}
