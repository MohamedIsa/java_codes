import java.util.*;
public class ArrayNum
{
 public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
  int[] arr=new int[10];
  int positive_counter=0,negative_counter=0,zeros_counter=0;
  System.out.println("Enter 10 integers:");
     for(int i=0;i<arr.length;i++){
     arr[i]=sc.nextInt();
     if(arr[i]>0)
      positive_counter++;
     else if(arr[i]<0)
            negative_counter++;
     else zeros_counter++;
  }
  
System.out.println("Number of Positive:"+positive_counter);
System.out.println("Number of Negative:"+negative_counter);
System.out.println("Number of zeros:"+zeros_counter);
 }
}