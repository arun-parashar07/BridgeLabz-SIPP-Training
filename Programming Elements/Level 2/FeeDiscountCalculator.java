package operators;

public class FeeDiscountCalculator {
    public static void main(String[] args) {
        int fee = 125000;
        int discountPercent = 10;

        double discount = (fee * discountPercent) / 100.0;
        double discountedFee = fee - discount;

        System.out.println(String.format(
            "The discount amount is INR %.2f and final discounted fee is INR %.2f",
            discount, discountedFee
        ));
    }
}

