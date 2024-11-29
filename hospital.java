import java.util.Scanner;

public class hospital {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        long cpr,lcpr=0;
        String surgery;
        int rectime,nop=0,unop=0,enop=0,lrectime=0;
        System.out.println("Enter the cpr of the patient (Negative number to stop),Surgery and time to recover");
        cpr=sc.nextLong();
        while(cpr>0){
            surgery=sc.next();
            rectime=sc.nextInt();
            if(surgery.equalsIgnoreCase("urgent")) unop++;
            if (surgery.equalsIgnoreCase("emergency"))enop++;
            if(rectime>lrectime){
                lrectime=rectime;
                lcpr=cpr;
            }
            nop++;
            cpr=sc.nextLong();

        }
        if(nop!=0){
            System.out.println("Number of patients: "+nop);
            System.out.println("Numbetr of patients that have urgent surgeries: "+unop);
            System.out.println("Numbetr of patients that have emergency surgeries: "+enop);
            System.out.println("CPR with the longest time to recover: "+lcpr);
        } else System.out.println("NO DATA");
    }
}
