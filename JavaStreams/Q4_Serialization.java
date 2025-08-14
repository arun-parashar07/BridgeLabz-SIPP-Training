import java.io.*;
import java.util.*;
class Employee implements Serializable {
    int id;
    String name;
    String dept;
    double salary;
    Employee(int i, String n, String d, double s) {
        id = i; name = n; dept = d; salary = s;
    }
}
public class Q4_Serialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "A", "IT", 10000));
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.dat"))) {
            oos.writeObject(list);
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emp.dat"))) {
            List<Employee> empList = (List<Employee>) ois.readObject();
            for (Employee e : empList) System.out.println(e.name);
        }
    }
}