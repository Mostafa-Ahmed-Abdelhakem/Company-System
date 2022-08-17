
package company;

public class Employee extends Person {
    
    protected float salary;
    protected String working_time;
    private final int employeeId = id;
    public Employee()
    {
        id++;
    }
    @Override
    public void print_extra_info()
    {
        super.print_extra_info();
        System.out.println("Salary: " + salary);
        System.out.println("Working Time: " + working_time);
        System.out.println("ID: " + employeeId);
    }
    
}
