import java.util.*;

public class ques9 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int fee = s.nextInt();
		double discountpercent = s.nextDouble();
		double discount = (fee * discountpercent)/100;
		double totalfee = fee - discount;
		
		System.out.println("The discount amount is INR "+ discount + " and final discounted fee is INR " + totalfee);
	}

}
