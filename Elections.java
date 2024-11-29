import java.util.*;
import java.io.*;
public class Elections
{
 public static final int MAX_VALUE=100;
 public static void main(String[] args){
 Scanner infile=null;
 String filename="elections.txt";
 int totalvotes=0;
 int totalcandidates=0;
 Candidates list[]=new Candidates[MAX_VALUE];
 try
 {
  infile=new Scanner(new File(filename));
  
  while(infile.hasNextLine())
  { 

    
    String name=infile.next();
    int votes=infile.nextInt();
    totalvotes+=votes;
    char gender=infile.next().charAt(0);
    list[totalcandidates]=new Candidates(name,votes,gender);
    totalcandidates++;
  }
  System.out.println("the total number of votes ="+totalcandidates);
  System.out.println("The total number of votes ="+totalvotes);
  
  for(int i=0;i<totalcandidates;i++)
  {
    double per=  100 * list[i].getVotes()/totalvotes;
    System.out.println(list[i].getName()+"\t"+list[i].getVotes()+"\t"+per);
  }
  
 }
 catch(FileNotFoundException e)
 {
  System.out.println("Error: file not found");
 }
 }
}