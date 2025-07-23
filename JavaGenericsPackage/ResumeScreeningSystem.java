package JavaGenericsPackage;

import java.util.List;

abstract class JobRole {
    private String roleName;
    public JobRole(String roleName) {
        this.roleName = roleName;
    }
    public String getRoleName() {
        return roleName;
    }
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer() {
        super("Software Engineer");
    }
}

class DataScientist extends JobRole {
    public DataScientist() {
        super("Data Scientist");
    }
}

class ProductManager extends JobRole {
    public ProductManager() {
        super("Product Manager");
    }
}

class Resume<T extends JobRole> {
    private T role;
    public Resume(T role) {
        this.role = role;
    }

    public T getRole() {
        return role;
    }

    public static void processResumes(List<? extends JobRole> resumes) {
        for (JobRole role : resumes) {
            System.out.println("Processing resume for: " + role.getRoleName());
        }
    }
}
