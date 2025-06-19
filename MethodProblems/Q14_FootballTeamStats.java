package methodsSheetSolutions;

import java.util.Random;

public class Q14_FootballTeamStats {
    public static int[] generateHeights(int players) {
        int[] heights = new int[players];
        Random rand = new Random();
        for (int i = 0; i < players; i++) {
            heights[i] = 150 + rand.nextInt(101); // 150 to 250
        }
        return heights;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int val : arr) sum += val;
        return sum;
    }

    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int val : arr) min = Math.min(min, val);
        return min;
    }

    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int val : arr) max = Math.max(max, val);
        return max;
    }

    public static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11);
        System.out.print("Heights: ");
        for (int h : heights) System.out.print(h + " ");
        System.out.println("\nShortest: " + findMin(heights));
        System.out.println("Tallest: " + findMax(heights));
        System.out.printf("Mean Height: %.2f\n", mean(heights));
    }
}
