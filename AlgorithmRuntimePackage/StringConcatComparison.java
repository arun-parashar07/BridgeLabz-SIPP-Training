public class StringConcatComparison {
    public static void main(String[] args) {
        int N = 10000;

        long start = System.nanoTime();
        String s = "";
        for (int i = 0; i < N; i++) {
            s += "a";
        }
        long end = System.nanoTime();
        System.out.println("String time: " + (end - start) + " ns");

        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append("a");
        }
        end = System.nanoTime();
        System.out.println("StringBuilder time: " + (end - start) + " ns");

        start = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < N; i++) {
            sbf.append("a");
        }
        end = System.nanoTime();
        System.out.println("StringBuffer time: " + (end - start) + " ns");
    }
}