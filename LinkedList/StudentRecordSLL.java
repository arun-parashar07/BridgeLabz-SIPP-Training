class Student {
    int rollNo;
    String name;
    int age;
    char grade;
    Student next;

    Student(int rollNo, String name, int age, char grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

public class StudentRecordSLL {
    static Student head = null;

    public static void addStudent(int roll, String name, int age, char grade) {
        Student newNode = new Student(roll, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    public static void deleteStudent(int roll) {
        if (head == null) return;
        if (head.rollNo == roll) {
            head = head.next;
            return;
        }
        Student temp = head;
        while (temp.next != null && temp.next.rollNo != roll)
            temp = temp.next;
        if (temp.next != null)
            temp.next = temp.next.next;
    }

    public static Student search(int roll) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNo == roll) return temp;
            temp = temp.next;
        }
        return null;
    }

    public static void updateGrade(int roll, char grade) {
        Student s = search(roll);
        if (s != null) s.grade = grade;
    }

    public static void display() {
        Student temp = head;
        while (temp != null) {
            System.out.printf("Roll: %d, Name: %s, Age: %d, Grade: %c\n", temp.rollNo, temp.name, temp.age, temp.grade);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        addStudent(101, "Alice", 20, 'A');
        addStudent(102, "Bob", 21, 'B');
        addStudent(103, "Charlie", 22, 'C');
        display();
        updateGrade(102, 'A');
        System.out.println("After Grade Update:");
        display();
        deleteStudent(103);
        System.out.println("After Deletion:");
        display();
    }
}
