import java.util.ArrayList;

class Faculty {
    String name;

    public Faculty(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Faculty: " + name);
    }
}

class DepartmentU {
    String name;

    public DepartmentU(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Department: " + name);
    }
}

public class UniversitySystem {
    String name;
    ArrayList<DepartmentU> departments = new ArrayList<>();
    ArrayList<Faculty> faculties = new ArrayList<>();

    public UniversitySystem(String name) {
        this.name = name;
    }

    public void addDepartment(DepartmentU d) {
        departments.add(d);
    }

    public void addFaculty(Faculty f) {
        faculties.add(f);
    }

    public void displayAll() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (DepartmentU d : departments) d.display();
        System.out.println("Faculties:");
        for (Faculty f : faculties) f.display();
    }

    public static void main(String[] args) {
        UniversitySystem uni = new UniversitySystem("Delhi University");
        uni.addDepartment(new DepartmentU("CS"));
        uni.addDepartment(new DepartmentU("Physics"));
        uni.addFaculty(new Faculty("Dr. Rakesh"));
        uni.addFaculty(new Faculty("Prof. Kavita"));
        uni.displayAll();
    }
}