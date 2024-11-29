import java.util.*;
public class Arraylist
 {
  public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array size (n):");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.print("please fill the array:");
    int odd=0,even=0,zeros=0;
    int[] arrodd=new int[n];
    int[] arreven=new int[n];
    int[] arrzero=new int[n];
    for(int i=0;i<n;i++)
    {
     arr[i]=sc.nextInt();
    if(arr[i]%2==1)
     {
      arrodd[odd]=arr[i];
      odd++;
      }
    else if(arr[i]%2==0 && arr[i]!=0)
     {
      arreven[even]=arr[i];
     even++;
     }
     else 
     {
      arrzero[zeros]=arr[i];
      zeros++;
     }
     
    }
    System.out.print("The array after rearranging:");
    for(int i=0;i<even;i++)
     System.out.print(arreven[i]+" ");
    for(int i=even;i<even+zeros;i++)
     System.out.print(arrzero[i]+" ");
    for(int i=0;i<odd;i++)
     System.out.print(arrodd[i]+" ");        
   }
 }