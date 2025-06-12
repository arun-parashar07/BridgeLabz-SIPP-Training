//find the power of a given number
package tech.com;
import java.util.Scanner;
public class powerofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner object = new Scanner(System.in);
		int num = object.nextInt();
		int power = object.nextInt();
//		further commented part of code has done for the " FOR " loop
//		int result = 1 ;
//		for(int i = 1; i <= power ; i++) {
//			result = result * num ;
//		
//		}	System.out.println(result);
//		now do it by using the while loop
		int count = 0;
		int result = 1;
		while(count < power) {
			result = result*num;
			count ++;
		}System.out.println(result);
		object.close();
		}

}
