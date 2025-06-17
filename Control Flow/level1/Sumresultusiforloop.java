package ControlflowLevel1;
import java.util.Scanner;
public class Sumresultusiforloop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if(number<=0) {
			System.out.println("enter valid nature number:-");
			return;
		}
		int sumfor=0;
		for(int i=1;i<=number;i++) {
          sumfor+=i;
         }
           
		int sumformula=number*(number+1)/2;
		System.out.println(sumformula);
		
		if(sumfor==sumformula) {
			System.out.println("result is same");
		}
		else {
			System.out.println("result is missedmatch");

		}
		sc.close();
	}

}
