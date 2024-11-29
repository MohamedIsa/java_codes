import java.util.Scanner;

public class arrayDemo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] list;
    int n;
    boolean sort = true;
    System.out.println("Enter the size of the array:");
    n = sc.nextInt();
    list = new int[n];
    System.out.println("Enter values");
    for (int i = 0; i < list.length; i++) {
      list[i] = sc.nextInt();
      if (list.length != 0)
        if (list[i] < list[i + 1])
          sort = false;
    }
    if (sort) {
      System.out.println("Sorted Array");
    } else {
      System.out.println("Not Sorted array");
    }

  }
}