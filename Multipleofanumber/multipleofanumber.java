//WAP to find multiples of a number taken as user input below 100
package tech.com;
import java.util.Scanner;
public class multipleofanumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner object = new Scanner(System.in);
		System.out.println("write the number you need to find the multiples of : ");
		int number = object.nextInt();
		for(int i = number ; i < 100 ; i+=number) {
			System.out.println(i);
			}if(number > 100) {
				System.out.println("Invalid Input");
		}
	}

}
