import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileName = "Credits.txt";
        Scanner sc = null;
        int freshmanCount = 0, sophomoreCount = 0, juniorCount = 0 , seniorCount = 0, maxCredits = 0;
        String topStudent = "";


        try {
            sc = new Scanner(new File(fileName));
            while (sc.hasNextLine()) {
                String name = sc.next();
                int credits = sc.nextInt();

                if (credits < 32) {
                    freshmanCount++;
                } else if (credits < 64) {
                    sophomoreCount++;
                } else if (credits < 96) {
                    juniorCount++;
                } else {
                    seniorCount++;
                }

                if (credits > maxCredits) {
                    maxCredits = credits;
                    topStudent = name;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }

        System.out.println("Number of students in each level:");
        System.out.println("Freshman " + freshmanCount);
        System.out.println("Sophomore " + sophomoreCount);
        System.out.println("Junior " + juniorCount);
        System.out.println("Senior " + seniorCount);
        System.out.println(
                "The student with max number of credits is " + topStudent + " with " + maxCredits + " credits");
    }
}