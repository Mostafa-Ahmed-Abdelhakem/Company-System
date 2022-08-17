
package company;

public class Client extends Person {
    
    protected String email;
    private final int clientId = id;
    
    public Client()
    {
        id++;
    }
    
    @Override
    public void print_extra_info()
    {
        super.print_extra_info();
        System.out.println("Email: " + email);
        System.out.println("ID: " + clientId);
    }
    
}
