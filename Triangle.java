public class Triangle {
  private int a;
  private int b;
  private int c;

  public Triangle() {
    a = 0;
    b = 0;
    c = 0;
  }

  public Triangle(int newA, int newB, int newC) {
    a = newA;
    b = newB;
    c = newC;
  }

  public int getA() {
    return a;
  }

  public int getB() {
    return b;
  }

  public int getC() {
    return c;
  }

  public static void checkTriangle(Triangle[] list) {
    int E = 0, I = 0, S = 0;
    for (Triangle triangle : list) {
      if (triangle.getA() == triangle.getB() && triangle.getA() == triangle.getC())
        E++;
      else if (triangle.getA() == triangle.getB() || triangle.getA() == triangle.getC()
          || triangle.getA() == triangle.getB() || triangle.getB() == triangle.getC())
        I++;
      else
        S++;
    }
    System.out.println("Number of Equilateral Triangles = " + E);
    System.out.println("Isosceles Triangles = " + I);
    System.out.println("Isosceles Triangle = " + S);

  }
}
