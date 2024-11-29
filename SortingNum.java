import java.util.*;
public class SortingNum
 {
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int[] list=new int[5];
  System.out.println("Enter 5 numbers:");
  for(int i=0;i<list.length;i++)
  {
   list[i]=sc.nextInt();
  }
    System.out.println("List:");
        for (int i = 0; i < 5; i++) {
            if (list[i] > 0) {
                System.out.println(list[i]);
            }
        }


        for (int i = 0; i < 5; i++) {
            if (list[i] < 0) {
                System.out.println(list[i]);
            }
        }
  
 
}
 }