package JavaGenericsPackage;

import java.util.Arrays;
import java.util.List;

public class MainResumeScreening {
    public static void main(String[] args) {
        List<JobRole> resumes = Arrays.asList(
            new SoftwareEngineer(),
            new DataScientist(),
            new ProductManager()
        );

        Resume.processResumes(resumes);
    }
}
