import java.util.*;

public class CircularBuffer {
    int[] buffer;
    int size, start = 0, end = 0, count = 0;

    public CircularBuffer(int k) {
        buffer = new int[k];
        size = k;
    }

    public void insert(int val) {
        buffer[end] = val;
        end = (end + 1) % size;
        if (count == size) {
            start = (start + 1) % size;
        } else {
            count++;
        }
    }

    public void printBuffer() {
        for (int i = 0; i < count; i++) {
            System.out.print(buffer[(start + i) % size] + " ");
        }
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.insert(1); cb.insert(2); cb.insert(3); cb.insert(4);
        cb.printBuffer();  // Output: 2 3 4
    }
}
