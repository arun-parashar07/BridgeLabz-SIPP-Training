package ControlflowLevel1;
import java.util.Scanner;
public class Personcanvote {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("person age is:- "  + age + " person can vote");
		}
		else {
			System.out.println("person age is  " + age + " person cannot vote");
		}

	}

}
