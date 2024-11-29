class Car {
    private String brand;
    private double price;

    public Car(String newBrand, double newPrice) {
        brand = newBrand;
        price = newPrice;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }
}

class Exhibition {
    private int current;
    private Car[] cars;
    private String name;

    public Exhibition(String name, int n) {
        this.name = name;
        this.cars = new Car[n];
        this.current = 0;
    }

    public boolean add(String brand, double price) {
        if (current < cars.length) {
            cars[current] = new Car(brand, price);
            current++;
            return true;
        }
        return false;
    }

    public void highestCar() {
        if (current == 0) {
            System.out.println("No cars in the exhibition.");
            return;
        }

        Car highest = cars[0];
        for (int i = 1; i < current; i++) {
            if (cars[i].getPrice() > highest.getPrice()) {
                highest = cars[i];
            }
        }

        System.out.println("Highest price car is " + highest.getBrand() + ", price=$" + highest.getPrice());
    }

    public int countOverPricedCar() {
        int count = 0;
        for (int i = 0; i < current; i++) {
            if (cars[i].getPrice() > 100) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Exhibition exhibition = new Exhibition("Bahrain", 3);

        exhibition.add("A", 1);
        exhibition.add("B", 150);
        exhibition.add("C", 200);

        exhibition.highestCar();

        int overPricedCount = exhibition.countOverPricedCar();
        System.out.println("Count of overpriced cars = " + overPricedCount);
    }

}
