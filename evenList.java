public class evenList {
  private int[] list;
  private int numItem;

  public evenList() {
    list = new int[10];
    numItem = 0;
  }

  public void AddItem(int y) {
    if (numItem == list.length)

      System.out.println("Full");
    else if (y % 2 == 1)
      System.out.println("Negative #");
    else {
      list[numItem + 1] = y;
      numItem++;
    }
  }

  public boolean isEmpty() {
    return numItem == 0 ? true : false;

  }
}