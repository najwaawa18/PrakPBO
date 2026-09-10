<<<<<<< HEAD
package Jobsheet1;
=======
>>>>>>> 1e326c1d84a44d330810d16777f5d3579c567cce
class Product {
    private final String itemName;
    private final float price;

    public Product (String itemName, float price) {
        this.itemName = itemName;
        this.price = price;
    }

    public float total(int quantity) {
        return price * quantity;
    }

    public String getName(){
        return itemName;
    }
}

public class OOP {
    public static void main(String[] args) {
        
        Product product1 = new Product("Coffe", 120000.0f);
        Product product2 = new Product("Sugar", 30000.0f);

        System.out.println(product1.getName() + ": " + product1.total(3));
        System.out.println(product2.getName() + ": " + product2.total(1));
    }
}
