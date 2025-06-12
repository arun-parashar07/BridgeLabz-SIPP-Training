import java.util.*;

public class ques14 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("distance in feet");
		double disfeet = s.nextInt();
		double yard = disfeet/3;
		double mile = yard/1760;
		
		System.out.println("The distance in yards is "+ yard+ " while the distance in miles is "+mile);

	}

}