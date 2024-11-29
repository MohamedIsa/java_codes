import java.util.Scanner;

public class blood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String type,htype="";
    int nod,counter=0,hnod=0;
    System.out.println("Enter Blood type and number of donors (stop to terminate)");
        type=sc.next();
    while (!type.equalsIgnoreCase("stop")){
        nod=sc.nextInt();

        if(nod>hnod){
            hnod=nod;
            htype=type;
        }
        counter++;

        type=sc.next();
    }
    System.out.println(htype+"is the highest number of donors = "+hnod);
    System.out.println("number of blood type entered is " +counter);
    }
}
