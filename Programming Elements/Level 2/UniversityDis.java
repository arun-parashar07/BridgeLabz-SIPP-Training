package operators;

import java.util.Scanner;

public class UniversityDis {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the student fee in INR: ");
        double fee = input.nextDouble();

        System.out.print("Enter the university discount percentage: ");
        double discountPercent = input.nextDouble();

        double discount = (fee * discountPercent) / 100;
        double discountedFee = fee - discount;

        System.out.println(String.format(
            "The discount amount is INR %.2f and final discounted fee is INR %.2f",
            discount, discountedFee
        ));

        input.close(); 
    }
}
