class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("Teacher: " + name + ", Subject: " + subject);
    }
}

class Student extends Person {
    private int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println("Student: " + name + ", Grade: " + grade);
    }
}

class Staff extends Person {
    private String position;

    public Staff(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    public void displayRole() {
        System.out.println("Staff: " + name + ", Position: " + position);
    }

    public static void main(String[] args) {
        Teacher t = new Teacher("Mr. Singh", 45, "Math");
        Student s = new Student("Aman", 16, 10);
        Staff f = new Staff("Mrs. Kaur", 50, "Librarian");

        t.displayRole();
        s.displayRole();
        f.displayRole();
    }
}