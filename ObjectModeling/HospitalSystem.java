import java.util.ArrayList;

class Doctor {
    String name;

    public Doctor(String name) {
        this.name = name;
    }

    public void consult(Patient patient) {
        System.out.println("Dr. " + name + " consulted with patient " + patient.name);
    }
}

class Patient {
    String name;

    public Patient(String name) {
        this.name = name;
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("Arun");
        Doctor d2 = new Doctor("Seema");

        Patient p1 = new Patient("Ravi");
        Patient p2 = new Patient("Anjali");

        d1.consult(p1);
        d2.consult(p2);
        d1.consult(p2);
    }
}