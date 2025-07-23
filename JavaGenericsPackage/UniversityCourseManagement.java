package JavaGenericsPackage;

import java.util.List;

abstract class CourseType {
    private String name;
    public CourseType(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

class ExamCourse extends CourseType {
    public ExamCourse(String name) {
        super(name);
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String name) {
        super(name);
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String name) {
        super(name);
    }
}

class Course<T extends CourseType> {
    private T type;
    public Course(T type) {
        this.type = type;
    }
    public T getType() {
        return type;
    }

    public static void printCourseNames(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            System.out.println(c.getName());
        }
    }
}
