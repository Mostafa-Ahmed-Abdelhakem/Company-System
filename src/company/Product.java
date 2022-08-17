
package company;


public class Product {
    
    private static int id = 1;
    protected String name;
    protected float price;
    private final int productID = id;
    
    public Product()
    {
        id++;
    }
    
    public void print_product_details()
    {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
    }
    
    
    
}
