
package company;

public class Main {
    
    public static void main(String[] args) {
        
        //persons 
        // employee
        Employee emp1 = new Employee();
        emp1.name = "Steve Jobs";
        emp1.phone = "+1 888-397-6633";
        emp1.gender = "Male";
        emp1.salary = 50000;
        emp1.working_time = "10 hour";
        // ----------------------------------
        // clients
        Client c1 = new Client();
        c1.name = "Mohamed Ahmed";
        c1.phone = "01123456789";
        c1.gender = "Male";
        c1.email = "mohamedahmed@gmail.com";
        
        Client c2 = new Client();
        c2.name = "Sara Mohame";
        c2.phone = "01123455436";
        c2.gender = "Female";
        c2.email = "saramohamed4@gmail.com";

        // ----------------------------------
        // products
        Product product1 = new Product();
        product1.name = "iphone";
        product1.price = 1500;
        
        Product product2 = new Product();
        product2.name = "MacBook";
        product2.price = 1100;
        
        Product product3 = new Product();
        product3.name = "AirPods pro";
        product3.price = 230;
        
        Product product4 = new Product();
        product4.name = "ipad pro";
        product4.price = 750;
        // ----------------------------------
        // orders
        Order ord1 = new Order();
        ord1.date = "10/7/2021";
        ord1.is_paid = true;
        ord1.person = c1;
        ord1.products.add(product1);
        ord1.products.add(product3);
        
        Order ord2 = new Order();
        ord2.date= "11/7/2021";
        ord2.is_paid = true;
        ord2.person = c1;
        ord2.products.add(product3);
        ord2.products.add(product4);
        
        Order ord3 = new Order();
        ord3.date= "12/7/2021";
        ord3.is_paid = true;
        ord3.person = c2;
        ord3.products.add(product1);
        ord3.products.add(product2);
        ord3.products.add(product3);
        ord3.products.add(product4);
        
        Order ord4 = new Order();
        ord4.date= "12/7/2021";
        ord4.is_paid = true;
        ord4.person = c2;
        ord4.products.add(product4);
        
        // ---------------------------------------------------------------------
        
        // company object
        Company company = new Company();
        
        company.add_person(emp1);
        company.add_person(c1);
        company.add_person(c2);
        
        company.add_product(product1);
        company.add_product(product2);
        company.add_product(product3);
        company.add_product(product4);
        
        company.add_order(ord1);
        company.add_order(ord2);
        company.add_order(ord3);
        company.add_order(ord4);
        
//        company.remove_order(4);
//        company.remove_person(1);
//        company.remove_product(3);
        
        company.print_person_info(3);
        System.out.println(" ------------------- ");
        company.print_product_details(1);
        System.out.println(" ------------------- ");
        company.print_order_details(2);
        System.out.println(" ------------------- ");
        company.print_person_orders(2);   
   }
}
