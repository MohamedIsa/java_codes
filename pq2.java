import java.util.Scanner;
import java.io.*;
public class pq2
{
 public static void main(String[] args)
 {
 
Scanner infile=null;
 
String filename="Cars.txt";
 
int counter=0;
 
try{
 
 
infile=new Scanner(new File(filename));
 
while(infile.hasNextLine())
 
{ 
 
int plate=infile.nextInt();
 
int month=infile.nextInt();
 
 
if(month>=3)
 
{
 
System.out.println("Car plate number "+plate+" is due for service");
 
System.out.println();
 
counter++;
 
}
 
 
}
 
 
}
 
catch(FileNotFoundException e)
 
{
 
 
System.out.println("Error: File Not Found");
 
 
}
 
System.out.println();
 
System.out.println("The number of cars due is:"+counter);
 }
 
 }