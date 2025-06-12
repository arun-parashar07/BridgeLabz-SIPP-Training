import java.util.*;

public class ques10 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("height in cm");
		double height = s.nextDouble();
		
		double inches = height / 2.54;
		double foot = inches/12;
		 System.out.println("Your Height in cm is "+ height + " while in feet is "+ foot + " and inches id "+inches );
		

	}

}
