import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner kdb = new Scanner(System.in);
        double x, y, z, sum, avg;
        System.out.println("Enter X:");
        x = kdb.nextDouble();
        System.out.println("Enter Y:");
        y = kdb.nextDouble();
        System.out.println("Enter Z:");
        z = kdb.nextDouble();
        sum = x + y + z;
        avg = sum / 3;
        System.out.println("The average is " + sum);
        System.out.println("The average is " + avg);

    }
}