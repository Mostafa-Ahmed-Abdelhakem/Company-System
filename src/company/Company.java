
package company;

import java.util.ArrayList;

public class Company {
    
    ArrayList<Person> persons = new ArrayList<>();
    ArrayList<Product> products = new ArrayList<>();
    ArrayList<Order> orders = new ArrayList<>();
    
    public void add_product(Product product)
    {
        products.add(product);
    }
    public void add_person(Person person)
    {
        persons.add(person);
    }
    public void add_order(Order order)
    {
        orders.add(order);
    }
    
    public void remove_product(int id)
    {
        products.remove((id - 1));
    }
    public void remove_person(int id)
    {
        persons.remove((id - 1));
    }
    public void remove_order(int id)
    {
        orders.remove((id - 1));
    }
    
    public void print_person_info(int id)
    {
        persons.get((id - 1)).print_extra_info();
    }
    public void print_product_details(int id)
    {
        products.get((id - 1)).print_product_details();
    }
    public void print_order_details(int id)
    {
        orders.get((id - 1)).print_order_details();
    }
    public void print_person_orders(int id)
    {
        for (int i = 0; i < orders.size(); i++)
        {
            if((orders.get(id).person.id) == id)
                orders.get(id).print_order_details();
        }
    }    
}// end Company class
