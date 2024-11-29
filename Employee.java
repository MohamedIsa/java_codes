import java.util.Scanner;
public class Employee
{
 public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    
    int age,counter=0,under=0,between=0,above=0;
    System.out.print("Enter 5 employees age:");
    while(counter<5)
    { 
       age=sc.nextInt();
       if(age<30)
        under++;
        else if(age>=30 && age<40)
           between++;
          else 
            above++; 
      counter++;
    }
    System.out.println("Number of Employees age Under 30 is "+under);
    System.out.println("Number of Employees age Between 30 and 40 is "+between);
    System.out.println("Number of Employees age above 40 is "+above);
  }

}