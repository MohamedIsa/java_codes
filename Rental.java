import java.util.*;
public class Rental{
    public static void main(String[] args){
        Scanner kbd=new Scanner(System.in);
        int dor,tc;
        System.out.println("How many rental days?");
        dor=kbd.nextInt();
        if(dor >0 && dor<=6){
            tc=dor*9;
            System.out.println("The total renting cost is BD "+tc);
            System.out.println("You have a voucher of 0 free days");
        } else if (dor>6 && dor<=14) {
            tc=dor*8;
            System.out.println("The total renting cost is BD "+tc);
            System.out.println("You have a voucher of 1 free days");
            
        } else if(dor>14){
            tc=dor*7;
            System.out.println("The total renting cost is BD "+tc);
            System.out.println("You have a voucher of 2 free days");

        } else {
            System.out.println("Invalid number of days");
        }

    }
}