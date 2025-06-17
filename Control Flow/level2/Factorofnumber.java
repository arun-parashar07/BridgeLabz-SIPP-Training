package ControlflowLevel1;
import java.util.*;
public class Factorofnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if(number>0) {
			System.out.println("number is positive number");
		}
			int counter=sc.nextInt();
			while(counter<number) {
				if(number%counter==0) {
					System.out.println("completely divides");
				}
				else {
					System.out.println("not divides completelt");
				}
			
		}

	}

}
