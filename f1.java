import java.util.Scanner;

public class f1 {
    public static void main(String[] args){
        Scanner kbd=new Scanner(System.in);
        long id,fid = 0;
        String type;
        int time,counter=0,alphacount=0,totaltime=0,avg,mintime=1000000;
        System.out.println("Enter 10 racer id, type and finish time:");


        while(counter<10){
            id=kbd.nextLong();
            type=kbd.next();
            time=kbd.nextInt();

        if(type.equalsIgnoreCase("alpha")){
            alphacount++;
            if(time<mintime){
                mintime=time;
                fid=id;
            }

        }
        totaltime+=time;



        counter++;

        }
        avg=totaltime/10;
        System.out.println("Number of alpha racers is "+alphacount);
        System.out.println("Average of all racers is "+avg + "Seconds");
        if (alphacount>0){
            System.out.println("Fastest alpha id’s is "+fid+" with time = "+mintime+" Seconds");
        }
    }
}
