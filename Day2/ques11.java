import java.util.*;

public class ques11 {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		System.out.println("enter the decimal no");
		
		double n1 = s.nextInt();
		double n2 = s.nextInt();
		
		double sum = n1+n2;
		double sub = n1 - n2;
		double mult= n1 * n2;
		double divi = n2 !=0 ? n1/n2 : Double.NaN;
		
		 System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + n1 + " and " + n2 + " is " + sum + "," + sub + "," + mult +  " and " + divi);
		
		/* System.out.println("The addition, subtraction, multiplication, and division value of two numbers " 
		            + n1 + " and " + n2 + " is " + sum + ", " + sub + ", " + mult + ", and " + divi);*/
	}

}
