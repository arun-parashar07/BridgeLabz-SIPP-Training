package BuiltInFun;

import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int low = 1, high = 100;
        String response = "";
        int guess;

        while (true) {
            guess = random.nextInt(high - low + 1) + low;
            System.out.println("Is your number " + guess + "? (high/low/correct)");
            response = scanner.nextLine();
            if ("correct".equalsIgnoreCase(response)) {
                System.out.println("Guessed the number!");
                break;
            } else if ("low".equalsIgnoreCase(response)) {
                low = guess + 1;
            } else if ("high".equalsIgnoreCase(response)) {
                high = guess - 1;
            }
        }
        scanner.close();
    }
}

