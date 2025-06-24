public class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: ₹" + salary);
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee("Rahul", 101, 50000);
        emp.displayDetails();
    }
}