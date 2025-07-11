package search.stringbuffer;

public class CompareStringBufferVsBuilder {
    public void comparePerformance() {
        int count = 1_000_000;
        long start, end;

        StringBuffer sbf = new StringBuffer();
        start = System.nanoTime();
        for (int i = 0; i < count; i++) sbf.append("hello");
        end = System.nanoTime();
        System.out.println("StringBuffer time: " + (end - start));

        StringBuilder sbd = new StringBuilder();
        start = System.nanoTime();
        for (int i = 0; i < count; i++) sbd.append("hello");
        end = System.nanoTime();
        System.out.println("StringBuilder time: " + (end - start));
    }
}
