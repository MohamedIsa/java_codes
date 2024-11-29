public class TaskClass
 {
  private String[] list;
  private int count;
  private int maxSize;
   public TaskClass(int m)
    {
    count=0;
    maxSize=m;
    list =new String[maxSize];
    }
    public void addTask(String T)
    {
     if(maxSize==count)
      {
       System.out.println("The list is full");
       return;
       } else 
       {
       list[count]=T;
       count++;
       }
    }
    boolean found=false;
    public boolean search(String T)
    { 
     for(int i=0;i<list.length;i++)
     { 
      if(list[i]==T)
       found=true;
     }
     return found;
     
    }
    public static void main(String[] args)
    {
     TaskClass myTask=new TaskClass(10);
     myTask.addTask("HomeWork1");
     myTask.addTask("HomeWork2");
     if(myTask.search("HomeWork1"))
      System.out.println("Found");
      else   System.out.println("Not Found");

    }
 }