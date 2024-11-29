import java.util.Scanner;

public class company
{    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String status;
    double salary,totalamount,socialbouns=0.0,yebonus=0.0;
    System.out.println("Enter Social status (Married or Single) and salary");
    status=sc.next();
    salary=sc.nextDouble();
    if(status.equalsIgnoreCase("single")){
        socialbouns=100.0;
    }
    if(status.equalsIgnoreCase("married")) {
        socialbouns=200.0;

    }
    if(salary<2000.0){
        yebonus=300.0;
    } else if (salary>=2000) {

        yebonus=0.2*salary;

    }
    totalamount=salary+socialbouns+yebonus;
    System.out.println("Total amount to be paid is BD "+totalamount);


}
}
