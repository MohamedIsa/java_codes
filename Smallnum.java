import java.util.*;
public class Smallnum
 {
 public static void main(String[] args)
  {
  Scanner sc=new Scanner(System.in);
  int[] list=new int[5];
  int min=Integer.MAX_VALUE;
  int minIndex=0;
  System.out.println("Enter 5 integers:");
  for(int i=0;i<list.length;i++)
   {
   list[i]=sc.nextInt();
   }
  for(int i=0;i<list.length;i++)
   {

    if(list[i]<=min)
    {
    min=list[i];
    minIndex=i;
    
    }
   }
   System.out.println("The smallest number is : "+min+" and  last index is : "+minIndex);
  }
 }