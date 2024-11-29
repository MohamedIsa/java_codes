import java.util.Scanner;
public class Rectangle
{
 double width;
 double height;
 
 public void setRectangle(double w,double h)
  {
    width=w;
    height=h;
  }
  public double getArea() {
   return width * height;
  }
  
  public static void main(String[] args)
  {
     Rectangle r1=new Rectangle();
     r1.setRectangle(5.5,6.0);
     System.out.println("The area of the rectangle is "+r1.getArea());
  
  }
}