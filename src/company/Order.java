
package company;

import java.util.ArrayList;

public class Order {
    
    private static int id = 1;
    protected String date;
    protected boolean is_paid;
    Person person;
    ArrayList<Product> products = new ArrayList<>();
    private final int orderID = id;
    
    public Order()
    {
        id++;
    }

    public void print_order_details()
    {
        System.out.println("Order ID: " + orderID);
        System.out.println("Order Date: " + date);
        System.out.println("Paid: " + is_paid);
        System.out.println("Products: ");
        for(int i = 0; i < products.size(); i++)
            products.get(i).print_product_details();
    }
   
}
