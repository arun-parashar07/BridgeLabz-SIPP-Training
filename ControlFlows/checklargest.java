//Write a program to check if the first, second, or third number is the largest of the three.
package aa;
public class checklargest {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1 ;
		int num2 = 2 ;
		int num3 = 3 ;
		if(num1 > num2 && num1 > num3) {
			System.out.println("First Value is the Greatest" + num1);
		}
		else if(num2 > num3 && num2 > num1) {
			System.out.println("Second Value is the Greatest" + num2);
		}
		else {
			System.out.println("Third Value is the Greatest" + num3);
		}
	}

}
