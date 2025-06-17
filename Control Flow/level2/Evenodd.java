package ControlflowLevel1;
import java.util.*;
public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if(number<0) {
			System.out.println("number is nature number");
		}else {			
			for(int i=1;i<=number;i++) {
				if(number%2==0) {
					System.out.println(i + "number is even");
				}
				else {
					System.out.println("number is odd");
				}
			}
		}

	}

}
