package ControlflowLevel1;
import java.util.*;
public class Checkseason {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int day=sc.nextInt();
		int months=sc.nextInt();
		if((months==3 && day>=20 && day<=31)||
		(months==4 && day>=1 && day<=30)||
		(months==5 && day>=1 && day<=31)||
		(months==6 && day>=1 && day<=20)){
			System.out.println("Its a Spring Season");
			
			
		}else {
			System.out.println("Not a Spring Season");
		}
		
		




	}

}
