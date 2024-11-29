import java.util.*;
public class Repaeted
 {
  public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of elements:");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.print("Enter values:");
    for(int i=0;i<n;i++)
    arr[i]=sc.nextInt();
   
   int index=-1;
   int repeatedvalue=0;
   for(int i=0;i<n;i++)
    {
     if(repeatedvalue==arr[i] && i!=0)
      {
       repeatedvalue=arr[i];
       index=i;
       break;
      }
    }
    
    System.out.println("The first repeated element is "+repeatedvalue+" Found at index "+index);
    }
 }