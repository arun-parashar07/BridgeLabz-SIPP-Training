import java.util.*;

public class RotateList {
    public static <T> List<T> rotate(List<T> list, int k) {
        int n = list.size();
        k = k % n;
        List<T> rotated = new ArrayList<>();
        rotated.addAll(list.subList(k, n));
        rotated.addAll(list.subList(0, k));
        return rotated;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        System.out.println("Rotated List: " + rotate(list, 2));
    }
}
