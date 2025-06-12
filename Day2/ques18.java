import java.util.*;

public class ques18 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter value for a: ");
        double a = s.nextInt();
        System.out.print("Enter value for b: ");
        double b = s.nextInt();
        System.out.print("Enter value for c: ");
        double c = s.nextInt();

        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;
        
        System.out.println("The results of Int Operations are "+result1 +","+result2+ " ,"+result3+ " and "+result4);
	}

}
