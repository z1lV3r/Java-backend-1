public class ThisExample {

   public static void main(String[] args) {
      long fiveDays = 5 * 24 * 60 * 60 * 1000;

      Product product = new Product();
      product.setName("Jitomate");
      product.setPrice(2.00f);
      product.setDueDate(System.currentTimeMillis() + fiveDays);

      System.out.println("Product: " + product.name); //Breaks encapsulation principle
      System.out.println("Price: " + product.getPrice());
      System.out.println("Due date: " + product.getDueDate());
      System.out.println("Product is expired: " + product.isOutDated());
   }

   static class Product {
      String name;
      float price;
      long dueDate;

      public String getName() {
         return name;
      }

      public void setName(String name) {
         this.name = name;
      }

      public float getPrice() {
         return price;
      }

      public void setPrice(float newPrice) {
         price = newPrice;
      }

      public long getDueDate() {
         return dueDate;
      }

      public void setDueDate(long newDueDate) {
         dueDate = newDueDate;
      }

      public boolean isOutDated() {
         return dueDate < System.currentTimeMillis();
      }
   }
}
