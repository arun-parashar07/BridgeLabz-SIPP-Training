package JavaGenericsPackage;

import java.util.Arrays;
import java.util.List;

public class MainUniversityCourse {
    public static void main(String[] args) {
        List<CourseType> courseList = Arrays.asList(
            new ExamCourse("Maths Exam"),
            new AssignmentCourse("CS Assignment"),
            new ResearchCourse("AI Research")
        );

        Course.printCourseNames(courseList);
    }
}
