package search.stringbuffer;

public class ConcatStringBuffer {
    public String concatenate(String[] strings) {
        StringBuffer sb = new StringBuffer();
        for (String str : strings) {
            sb.append(str);
        }
        return sb.toString();
    }
}
