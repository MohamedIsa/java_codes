public class Candiates
{ 
  private String name;
  private int elections;
  private char gender;
   
   public Candiates(String name , int elections , char gender)
    {
     this.name=name;
     this.elections=elections;
     this.gender=gender;
    } 
    public void setName(String name){this.name=name;}
    public void setElc(int elections){this.elections=elections;}
    public void setGender(char gender){this.gender=gender;}
    
    public String getName(){return name;}
    public int getElc(){return elections;}
    public char getGender(){return gender;} 
 }