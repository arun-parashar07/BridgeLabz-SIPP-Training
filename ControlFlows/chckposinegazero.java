package aa;
import java.util.Scanner;
public class chckposinegazero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner object = new Scanner(System.in);
		int num = object.nextInt();
		if(num>0) {
			System.out.println("number is positive");
		}
		else if(num<0) {
			System.out.println("number is negative");
		}
		else {
			System.out.println("number is Zero");
		}
	}

}
