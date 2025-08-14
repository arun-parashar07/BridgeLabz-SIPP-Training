import java.util.*;

class Patient implements Comparable<Patient> {
    String name;
    int severity;

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    @Override
    public int compareTo(Patient o) {
        return o.severity - this.severity;
    }

    public String toString() {
        return name + " (" + severity + ")";
    }
}

public class HospitalTriageSystem {
    public static void main(String[] args) {
        PriorityQueue<Patient> pq = new PriorityQueue<>();
        pq.add(new Patient("John", 3));
        pq.add(new Patient("Alice", 5));
        pq.add(new Patient("Bob", 2));

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
