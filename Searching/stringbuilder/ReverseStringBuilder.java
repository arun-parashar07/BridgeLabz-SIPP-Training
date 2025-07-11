package search.stringbuilder;

public class ReverseStringBuilder {
    public String reverse(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }
}
