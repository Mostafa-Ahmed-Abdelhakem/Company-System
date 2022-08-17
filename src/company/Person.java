
package company;

public class Person {
    
    protected static int id = 1;
    protected String name;
    protected String phone;
    protected String gender;
    
    public void print_extra_info()
    {
//        System.out.println("ID: " + this.id);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Gender: " + gender);
    }
    
}// end Person class
