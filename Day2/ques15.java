import java.util.*;

public class ques15 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		double unitprice = s.nextDouble();
		double quantity = s.nextDouble();
		double totalprice = unitprice*quantity;
		
		System.out.println(" The total purchase price is INR "+totalprice+" if the quantity "+quantity+ " and unit price is INR "+unitprice);

	}

}