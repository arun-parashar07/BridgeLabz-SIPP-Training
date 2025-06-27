import java.util.ArrayList;

class Course {
    String name;
    ArrayList<Student> enrolledStudents = new ArrayList<>();

    public Course(String name) {
        this.name = name;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void showStudents() {
        System.out.println("Course: " + name + " Students:");
        for (Student s : enrolledStudents) {
            System.out.println("- " + s.getName());
        }
    }
}

class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void enroll(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    public void showCourses() {
        System.out.println("Student: " + name + " enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.name);
        }
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        Student s1 = new Student("Amit");
        Student s2 = new Student("Neha");

        s1.enroll(c1);
        s1.enroll(c2);
        s2.enroll(c1);

        s1.showCourses();
        s2.showCourses();

        c1.showStudents();
        c2.showStudents();
    }
}