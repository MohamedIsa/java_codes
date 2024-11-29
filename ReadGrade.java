import java.util.Scanner;
import java.io.*;
public class ReadGrade
{ 
  public static void main(String[] args)
   {
   try{
    PrintWriter outfile=null;
    String file="student.txt";
    Scanner sc= new Scanner(System.in);
    outfile=new PrintWriter(file);
    for(int i=0;i<5;i++)
       { 
         System.out.println("Student #"+(i+1)+"\nEnter full name:");
         String name=sc.next();         
         System.out.println("Enter id and two tests:");
         long id=sc.nextLong();
         double t1=sc.nextDouble();
         double t2=sc.nextDouble();
         double avg=(t1+t2)/2;
         outfile.println(name+","+id+","+t1+","+t2+","+avg);
       }
       System.out.println("Student data saved Successfully");
       outfile.close();
        
       }
       catch(FileNotFoundException e)
       {
        System.out.println(e.getMessage());
       }
    }
}