//Rewrite program 8 to do the countdown using the for-loop
package aa;
import java.util.Scanner;
public class RocketlaunchbyFOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner object = new Scanner(System.in);
		int count = object.nextInt();
		for(int i = count ; i >=1 ; i --) {
			System.out.println(i);
		}
		System.out.println("Rocket Launch");
	}

}
