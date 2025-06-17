package ControlflowLevel1;
import java.util.*;
public class Checknumberposi {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if(number>0) {
			System.out.println("positive number");
		}
		if(number<0) {
			System.out.println("negative number");
		}if(number==0) {
			System.out.println("zero");
		}
		


	}

}
