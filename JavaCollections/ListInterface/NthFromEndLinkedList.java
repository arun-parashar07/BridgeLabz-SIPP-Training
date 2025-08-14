import java.util.*;

public class NthFromEndLinkedList {
    public static <T> T getNthFromEnd(LinkedList<T> list, int n) {
        Iterator<T> lead = list.iterator();
        Iterator<T> follow = list.iterator();
        for (int i = 0; i < n; i++) {
            if (lead.hasNext()) lead.next();
            else return null;
        }
        while (lead.hasNext()) {
            lead.next();
            follow.next();
        }
        return follow.next();
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        System.out.println("Nth from end: " + getNthFromEnd(list, 2));
    }
}
