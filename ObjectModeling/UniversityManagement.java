class CourseUM {
    String name;

    public CourseUM(String name) {
        this.name = name;
    }
}

class StudentUM {
    String name;

    public StudentUM(String name) {
        this.name = name;
    }

    public void enrollCourse(CourseUM course) {
        System.out.println(name + " enrolled in " + course.name);
    }
}

class ProfessorUM {
    String name;

    public ProfessorUM(String name) {
        this.name = name;
    }

    public void assignProfessor(CourseUM course) {
        System.out.println(name + " assigned to " + course.name);
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        StudentUM s = new StudentUM("Manish");
        ProfessorUM p = new ProfessorUM("Dr. Rao");
        CourseUM c = new CourseUM("Machine Learning");

        s.enrollCourse(c);
        p.assignProfessor(c);
    }
}