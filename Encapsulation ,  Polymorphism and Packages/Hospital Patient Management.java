interface MedicalRecord {
    void addRecord(String note);
    void viewRecords();
}

abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient: " + name + ", Age: " + age + ", ID: " + patientId);
    }
}

class InPatient extends Patient implements MedicalRecord {
    private String[] records = new String[5];
    private int index = 0;

    public InPatient(String id, String name, int age) {
        super(id, name, age);
    }

    public double calculateBill() {
        return 5000.0;
    }

    public void addRecord(String note) {
        records[index++] = note;
    }

    public void viewRecords() {
        System.out.println("Medical Records:");
        for (String r : records) {
            if (r != null) System.out.println("- " + r);
        }
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private String diagnosis;

    public OutPatient(String id, String name, int age) {
        super(id, name, age);
    }

    public double calculateBill() {
        return 1200.0;
    }

    public void addRecord(String note) {
        diagnosis = note;
    }

    public void viewRecords() {
        System.out.println("Diagnosis: " + diagnosis);
    }

    public static void main(String[] args) {
        Patient p1 = new InPatient("P101", "Raj", 40);
        p1.getPatientDetails();
        System.out.println("Bill: ₹" + p1.calculateBill());

        Patient p2 = new OutPatient("P102", "Neha", 30);
        p2.getPatientDetails();
        System.out.println("Bill: ₹" + p2.calculateBill());
    }
}
