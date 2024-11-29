public class Item
 {
  private String type;
  private double price;
  public Item()
   {
    type="none";
    price=0.0;
   }
   public void setItem(String newT,double newP)
    {
    type=newT;
    price=newP;
    }
    public String getType()
     {
     return type;
     }
     public double getPrice()
     {
     return price;
     }
     public static void lowestPrice(Item[] items)
      {
       double lowestprice=1000000;
       String lowtype="";
       for(Item item:items)
        {
        if(item.getPrice()<lowestprice)
         {
          lowestprice=item.getPrice();
          lowtype=item.getType();
         }
        }
        System.out.println("the minimum price of the items is "+lowestprice);
        System.out.println("the type of the item with the minmum price is "+lowtype);
      }
 }