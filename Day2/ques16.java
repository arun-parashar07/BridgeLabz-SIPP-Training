import java.util.*;

public class ques16 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int n1 = s.nextInt();
        System.out.print("Enter second number: ");
        int n2 = s.nextInt();

        int quotient = n2 != 0 ? n1 / n2 : Integer.MIN_VALUE;
        int remainder = n2 != 0 ? n1 % n2 : Integer.MIN_VALUE;

        System.out.printf("The Quotient is "+quotient+" and Reminder is "+remainder+" of two number "+n1+ " and "+n2);

	}

}
