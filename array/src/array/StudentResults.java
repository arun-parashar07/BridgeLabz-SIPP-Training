package array;

import java.util.Scanner;

public class StudentResults {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3]; // Physics, Chemistry, Math
        double[] percentages = new double[n];
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i +1));
            for (int j = 0; j < 3; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                int mark = sc.nextInt();
                while (mark < 0 || mark > 100) {
                    System.out.print("Enter positive marks up to 100: ");
                    mark = sc.nextInt();
                }
                marks[i][j] = mark;
            }
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (total / 300) * 100;
            if (percentages[i] >= 60) {
                grades[i] = "First class";
            } else if (percentages[i] >= 50) {
                grades[i] = "Second class";
            } else {
                grades[i] = "Fail";
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " Marks: " + java.util.Arrays.toString(marks[i]) +
                               ", Percentage: " + percentages[i] + ", Grade: " + grades[i]);
        }
    }
}