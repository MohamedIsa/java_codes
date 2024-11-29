import java.util.*;
public class Battery
  {
  public static void main(String[] args)
   {
   Scanner sc=new Scanner(System.in);
   int[] batteryList =new int[5];
   double consumption;
   
    for(int i=0; i<batteryList.length; i++)
     {
      System.out.print("Enter battery capacity "+i+":");
      batteryList[i]=sc.nextInt();
     }
     System.out.print("Enter typical consumption (mA):");
     consumption=sc.nextDouble();
     System.out.println("Battery that will estimated battery life less than 5 hours life:");
     for(int i=0; i<batteryList.length ;i++)
     {
      double ebatterylife=batteryList[i]/consumption;
      if(ebatterylife<5)
      System.out.println("Battery located in index = "+i+" with estimated life: "+ebatterylife);
     }
     
    }
      
  }