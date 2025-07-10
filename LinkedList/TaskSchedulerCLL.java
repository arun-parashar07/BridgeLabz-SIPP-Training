class Task {
    int id;
    String name;
    int priority;
    String dueDate;
    Task next;

    Task(int id, String name, int priority, String dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
    }
}

public class TaskSchedulerCLL {
    static Task head = null;

    public static void addTask(int id, String name, int priority, String dueDate) {
        Task newTask = new Task(id, name, priority, dueDate);
        if (head == null) {
            head = newTask;
            head.next = head;
        } else {
            Task temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = newTask;
            newTask.next = head;
        }
    }

    public static void removeTask(int id) {
        if (head == null) return;
        Task curr = head, prev = null;
        do {
            if (curr.id == id) {
                if (prev != null) prev.next = curr.next;
                else {
                    Task tail = head;
                    while (tail.next != head) tail = tail.next;
                    if (head == head.next) head = null;
                    else {
                        tail.next = head.next;
                        head = head.next;
                    }
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    public static void displayTasks() {
        if (head == null) return;
        Task temp = head;
        do {
            System.out.println(temp.id + " - " + temp.name + " - Priority: " + temp.priority + " - Due: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    public static void searchByPriority(int priority) {
        if (head == null) return;
        Task temp = head;
        do {
            if (temp.priority == priority)
                System.out.println("Match: " + temp.name + " (ID: " + temp.id + ")");
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        addTask(1, "Email Client", 2, "2025-06-21");
        addTask(2, "Project Report", 1, "2025-06-22");
        addTask(3, "Code Cleanup", 3, "2025-06-23");
        displayTasks();
        searchByPriority(1);
        removeTask(2);
        System.out.println("After Deletion:");
        displayTasks();
    }
}
