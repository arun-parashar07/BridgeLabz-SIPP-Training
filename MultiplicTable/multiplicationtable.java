package tech.com;
import java.util.Scanner;
public class multiplicationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner object = new Scanner(System.in);
		System.out.println("Enter A Number between 6 and 9");
		int number = object.nextInt();
		int result = 1;
		for(int i = 1; i < 11 ; i++) {
			result = number * i;
			System.out.println(result);
		}
		object.close();
	}

}
