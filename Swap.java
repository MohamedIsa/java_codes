import java.util.Scanner;
public class Swap
{ 
 public static void main(String[] args)
  { 
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.print("Enter the number n: ");
    n=sc.nextInt();
    if(n%2==1)
    {
     System.out.println("The number n should be even");
     System.exit(0);
    }
    int[] array1=new int[n]; 
    int[] array2=new int[n];
    System.out.print("Enter "+n+" Integers number to array 1:");
    for(int i=0;i<n;i++)
      array1[i]=sc.nextInt();
    System.out.print("Enter "+n+" Integers number to array 2:");
    for(int i=0;i<n;i++)
      array2[i]=sc.nextInt();
   int temp=0;
   
   for(int i=0;i<n/2;i++)
   { temp=array1[i+n/2];
     array1[i+n/2]=array2[i];
     array2[i]=temp;
   }
   
   System.out.print("The elemnets inside the array 1 after swapping:");
    for(int i=0;i<n;i++)
    System.out.print( array1[i]+" ");
    
    System.out.print("\nThe elemnets inside the array 2 after swapping:");
    for(int i=0;i<n;i++)
    System.out.print( array2[i]+" ");

  }
 
}