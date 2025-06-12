//Write a program to check if the first is the smallest of the 3 numbers.
package aa;
public class checkthefirst {
	public static void main(String[] args) {
		int num1 = 9;
		int num2 = 63;
		int num3 = 10;
		if(num1 < num2 && num1 < num3) {
			System.out.println(num1 + ". Yes this number is smallest of three");
		}
		else {
			System.out.println("NO");
		}
	}
}
