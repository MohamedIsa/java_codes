import java.util.Scanner;

public class car {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w,price;
        double disc,bill;
    System.out.println("How many of car washes?");
    w=scanner.nextInt();
    if(w>0 && w<10){
        price=3*w;
        disc=0;
        bill=price-disc;
        System.out.println("Price:BD "+price);
        System.out.println("Discount:BD "+disc);
        System.out.println("Bill:BD "+bill);
    } else if(w>10 && w<=20){
        price=3*w;
        disc=0.1*price;
        bill=price-disc;
        System.out.println("Price:BD "+price);
        System.out.println("Discount:BD "+disc);
        System.out.println("Bill:BD "+bill);
        System.out.println("Offer:1 free car wash");
    } else if (w>20){
        price=3*w;
        disc=0.15*price;
        bill=price-disc;
        System.out.println("Price:BD "+price);
        System.out.println("Discount:BD "+disc);
        System.out.println("Bill:BD "+bill);
        System.out.println("Offer:Free oil change");
    }
    else{
        System.out.println("Invalid Input");
        System.exit(0);
    }
    }
}
