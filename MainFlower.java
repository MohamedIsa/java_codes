import java.util.Scanner;

public class MainFlower {
    public static void main(String[] args) {
        Flower flower1 = new Flower();
        flower1.print();
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter the flower name:");
        String flowerName1 = kbd.nextLine();
        System.out.println("Enter the flower price:");
        double flowerPrice1 = kbd.nextDouble();
        flower1.set(flowerName1, flowerPrice1);
        flower1.print();


        Flower flower2 = new Flower();
        flower2.print();
        System.out.println("Enter the flower name:");
        String flowerName2 = kbd.nextLine();
        System.out.println("Enter the flower price:");
        double flowerPrice2 = kbd.nextDouble();
        flower2.set(flowerName2, flowerPrice2);
        flower2.print();


        System.out.println("Total number of flowers: " + Flower.getNumberOfFlowers());

    }
}