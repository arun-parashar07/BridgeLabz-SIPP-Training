import java.util.Scanner;

public class TrimSpacesDemo {
    public static String customTrim(String text) {
        int start = 0, end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') start++;
        while (end >= start && text.charAt(end) == ' ') end--;
        String result = "";
        for (int i = start; i <= end; i++) result += text.charAt(i);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String custom = customTrim(input);
        String builtin = input.trim();
        System.out.println("Custom: [" + custom + "]");
        System.out.println("Built-in: [" + builtin + "]");
        System.out.println("Match: " + custom.equals(builtin));
    }
}
