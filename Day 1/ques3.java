//Write a program that takes the temperature in Celsius as input and converts 
//it to Fahrenheit using the formula:
//Fahrenheit = (Celsius * 9/5) + 32.

package com.tech;
import java.util.Scanner;
public class ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Write the temp. in celsius");
		int temp = sc.nextInt();
		double temp_1 = (temp*9/5) + 32 ;
		System.out.println("The result value is "  + temp_1);
	}

}
