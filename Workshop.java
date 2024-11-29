public class Workshop {
  private String title;
  private int capacity;
  private int[] list;
  private int size;

  public Workshop(String t, int c) {
    title = t;
    capacity = c;
    list = new int[c];
    size = 0;
  }

  public void register(int NewCpr) {
    for (int i = 0; i < list.length; i++)
      if (i <= capacity) {
        list[i] = NewCpr;
        size++;
      }

  }

  public void show() {
    System.out.println("Title " + title);
    System.out.println("Registerd persons:");
    for (int i = 0; i < list.length; i++)
      System.out.println(list[i]);
  }

}