import java.util.Scanner;

public class speed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed,c1=0,c2=0,totalc;
        double c1price,c2price;
        System.out.println("Enter Car speeds (Negative or zero to stop)");
        speed=sc.nextInt();
        while(speed>0){
            if(speed>120&&speed<=160){
                c1++;
            }
            if(speed>160){
                c2++;
            }
            speed=sc.nextInt();
        }
        totalc=c1+c2;
        if(totalc!=0){
            if(c1!=0){
                c1price=c1*50.0;
                System.out.println("the total fines for category 1 is BD "+c1price);
            }
            if (c2!=0){
                c2price=c2*100.0;
                System.out.println("the total fines for category 2 is BD "+c2price);
            }
            System.out.println("the total number of cars that exceed the limit is "+totalc);


        } else System.out.println("there are no cars exceed the speed limit");

    }
}
