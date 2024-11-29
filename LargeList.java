public class LargeList {
  private int[] list;
  private int numItems;

  public LargeList() {
    numItems = 0;
    list = new int[10];
  }

  public void addItems(int num) {
    if (list.length == numItems)
      System.out.println("The List is Full");

    else {
      boolean found = true;
      for (int i = 0; i < list.length; i++) {
        if (num < list[i] && list[i] % 2 == 1) {
          found = false;
          break;
        }
      }
      if (found) {
        list[numItems] = num;
        numItems++;
      }

    }
  }

  public int getCountBelow(int newValue) {
    int counter = 0;
    for (int i = 0; i < list.length; i++) {
      if (list[i] < newValue)
        counter++;
    }

    return counter;

  }

  public void getEntryAt(int index) {
    if ((0 <= index) && (index < numItems))
      System.out.println(list[index]);
    else
      System.out.println("Invalid index");
  }
}