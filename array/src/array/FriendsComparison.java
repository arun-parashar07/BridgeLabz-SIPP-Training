package array;

import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age for " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height for " + names[i] + ": ");
            heights[i] = sc.nextInt();
        }

        int minAge = ages[0], maxHeight = heights[0], minIndexAge = 0, maxIndexHeight = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                minIndexAge = i;
            }
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                maxIndexHeight = i;
            }
        }

        System.out.println(names[minIndexAge] + " is the youngest");
        System.out.println(names[maxIndexHeight] + " is the tallest");
    }
}