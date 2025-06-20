public class StudentScoreCard {
    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++)
            for (int j = 0; j < 3; j++)
                scores[i][j] = 40 + (int)(Math.random() * 60);
        return scores;
    }

    public static double[] calculatePercentage(int[] marks) {
        int total = marks[0] + marks[1] + marks[2];
        double avg = total / 3.0;
        double percent = total / 3.0;
        return new double[]{total, avg, percent};
    }

    public static char grade(double percent) {
        if (percent >= 90) return 'A';
        if (percent >= 80) return 'B';
        if (percent >= 70) return 'C';
        if (percent >= 60) return 'D';
        return 'F';
    }

    public static void main(String[] args) {
        int[][] scores = generateScores(5);
        System.out.println("Phy Chem Math Total Avg % Grade");
        for (int[] s : scores) {
            double[] res = calculatePercentage(s);
            System.out.printf("%3d %4d %4d %5.0f %4.1f %4.1f %2c\n",
                    s[0], s[1], s[2], res[0], res[1], res[2], grade(res[2]));
        }
    }
}
