class Process {
    int id, burstTime, priority, remainingTime;
    Process next;

    Process(int id, int burstTime, int priority) {
        this.id = id;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
    }
}

public class RoundRobinCLL {
    static Process head = null;

    public static void addProcess(int id, int burstTime, int priority) {
        Process newProcess = new Process(id, burstTime, priority);
        if (head == null) {
            head = newProcess;
            head.next = head;
        } else {
            Process temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = newProcess;
            newProcess.next = head;
        }
    }

    public static void simulateRoundRobin(int quantum) {
        if (head == null) return;
        Process curr = head;
        int time = 0, completed = 0, total = 0;

        Process temp = head;
        do {
            total++;
            temp = temp.next;
        } while (temp != head);

        while (completed < total) {
            if (curr.remainingTime > 0) {
                int run = Math.min(quantum, curr.remainingTime);
                curr.remainingTime -= run;
                time += run;
                System.out.println("Process " + curr.id + " ran for " + run + " units. Remaining: " + curr.remainingTime);
                if (curr.remainingTime == 0) {
                    completed++;
                    System.out.println("Process " + curr.id + " completed at time " + time);
                }
            }
            curr = curr.next;
        }
    }

    public static void displayQueue() {
        if (head == null) return;
        Process temp = head;
        do {
            System.out.println("P" + temp.id + " (Burst: " + temp.burstTime + ", Priority: " + temp.priority + ")");
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        addProcess(1, 10, 2);
        addProcess(2, 5, 1);
        addProcess(3, 8, 3);
        displayQueue();
        simulateRoundRobin(4);
    }
}
