//Write a program that takes two numbers as input from the user and prints their sum

package com.tech;
import java.util.Scanner;
public class ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of A");
		int a=sc.nextInt();
		System.out.println("Enter the value of B");
		int b=sc.nextInt();
		int c=a+b;
		System.out.print("The result is " + c);
		
	}

}
