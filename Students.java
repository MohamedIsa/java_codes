import java.util.*;
public class Students
 {
  public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of students (n):");
    int n=sc.nextInt();
    double[] marks=new double[n];
    System.out.print("please Enter the students mark:");
    double total =0.0;
    for(int i=0;i<n;i++)
    {
     marks[i]=sc.nextDouble();
     total+=marks[i];
    }
    double avg=total/n;
    System.out.println("The avg is :"+avg);
    for(int i=0;i<n;i++)
    {
     if(marks[i]>=avg)
     System.out.println("Student("+(i+1)+") with marks "+marks[i]+" is PASS");
     else System.out.println("Student("+(i+1)+") with marks "+marks[i]+" is FAIL");
    }
    
   }
 }