interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Salary: ₹" + calculateSalary());
    }

    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }
}

class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    public double calculateSalary() {
        return getBaseSalary();
    }

    public void assignDepartment(String dept) {
        department = dept;
    }

    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private String department;

    public PartTimeEmployee(int id, String name, double ratePerHour, int hoursWorked) {
        super(id, name, ratePerHour);
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return getBaseSalary() * hoursWorked;
    }

    public void assignDepartment(String dept) {
        department = dept;
    }

    public String getDepartmentDetails() {
        return "Department: " + department;
    }

    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(101, "Amit", 50000);
        Employee e2 = new PartTimeEmployee(102, "Neha", 500, 40);
        e1.displayDetails();
        e2.displayDetails();
    }
}