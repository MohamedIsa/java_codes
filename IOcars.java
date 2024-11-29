import java.io.*;
import java.util.*;

public class IOcars {
    public static void main(String[] args) {
        Scanner infile = null;
        PrintWriter outfile = null;
        String infilename = "cars.txt";
        String outfilename = "results.txt";
        int counter = 0;
        try {
            infile = new Scanner(new File(infilename));
            outfile = new PrintWriter(new File(outfilename));
            while (infile.hasNextLine()) {
                String[] data = infile.nextLine().split(";");
                String make = data[0];
                int model = Integer.parseInt(data[1]);
                double price = Double.parseDouble(data[2]);
                if (model >= 2019) {
                    price = price + price * 0.05;
                    counter++;
                }
                outfile.println(make + ";" + model + ";" + price);
            }
            outfile.println("#number of cars with model year 2019 or later: " + counter);
            System.out.println("Results written to " + outfilename);
            infile.close();
            outfile.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.exit(0);
        }
    }
}
