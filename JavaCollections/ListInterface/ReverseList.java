import java.util.*;

public class ReverseList {
    public static <T> List<T> reverse(List<T> list) {
        List<T> reversed = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }

    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Reversed ArrayList: " + reverse(arrList));

        List<Integer> linkedList = new LinkedList<>(arrList);
        System.out.println("Reversed LinkedList: " + reverse(linkedList));
    }
}
