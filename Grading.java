import java.util.*;
import java.io.*;
public class Grading
{
 public static void main(String[] args)
  {
    int counter=0;
    String[] pcourse=new String[1000];
    String filename="results.txt";
    Scanner infile=null;
    long eid=0;
    try
    {
     Scanner sc=new Scanner(System.in);
     infile=new Scanner(new File(filename));
     System.out.println("Enter a student ID:");
     eid=sc.nextLong();
     while(infile.hasNextLine())
     {
       String[] data=infile.nextLine().split(";");
       String course= data[0];
       long id =Long.parseLong(data[1]);
       String name=data[2];
       int grade= Integer.parseInt(data[3]); 
       if(eid==id)
       {
        if(grade>=60)
        {
         pcourse[counter]=course;
         counter++;
        }
       }
     }
    }
     catch(FileNotFoundException e)
     {
      System.out.println("Error: File not found");
     }
     if(counter==0)
     {
      System.out.println("The student with the ID "+eid+" did not pass any courses");
     }
     else
      System.out.println("The student with the ID "+eid+" has passed "+counter+" courses:");
      for(int i=0;i<counter;i++)
       System.out.println(pcourse[i]);
  }
}