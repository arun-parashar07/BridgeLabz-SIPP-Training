package operators;

public class ProfitLossCalculator {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;

        int profit = sellingPrice - costPrice;
        double profitPercentage = (profit / (double) costPrice) * 100;

        // Display the result using a single print statement
        System.out.println(String.format(
            "The Cost Price is INR %d and Selling Price is INR %d\n" +
            "The Profit is INR %d and the Profit Percentage is %.2f%%",
            costPrice, sellingPrice, profit, profitPercentage
        ));
    }
}
