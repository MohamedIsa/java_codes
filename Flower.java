//name:mohamed isa hasan
//id:202002725
public class Flower {
    private String name;
    private double price;
    private static int NumberOfFlowers = 0;


    public Flower() {
        this.name = "Rose";
        this.price = 0.0;
        NumberOfFlowers++;
    }


    public Flower(String name, double price) {
        this.name = name;
        NumberOfFlowers++;
        if (price >= 0.0) {
            this.price = price;
        } else {

            this.price = 0.0;
        }

    }


    public void set(String name, double price) {
        this.name = name;
        if (price >= 0.0) {
            this.price = price;
        }
    }


    public String getName() {
        return this.name;
    }


    public double getPrice() {
        return this.price;
    }


    public void print() {
        System.out.println("Flower Name: " + this.name);
        System.out.println("Flower Price: " + this.price);
        System.out.println("Number of Flowers: " + NumberOfFlowers);
    }


    public static int getNumberOfFlowers() {
        return NumberOfFlowers;
    }


    public static void setNumberOfFlowers(int num) {
        NumberOfFlowers = num;
    }
}
