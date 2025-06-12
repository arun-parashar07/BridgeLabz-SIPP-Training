package tech.com;
import java.util.Scanner;
public class oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner object = new Scanner(System.in);
		int final_num = object.nextInt();
		int num = 1;
		for(int i = num ; i < final_num; i++) {
		if(i%2==0) {
			System.out.println("It is Even: " + i);
		}
		else {
			System.out.println("It is odd: " + i);
		}
		}
				}

}
