//Write a program to calculate the volume of a cylinder. Take the radius and
//height as inputs and use the formula:
package com.tech;
import java.util.Scanner;

public class ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter radius of the cylinder: ");
	        double radius = scanner.nextDouble();
	        System.out.print("Enter height of the cylinder: ");
	        double height = scanner.nextDouble();
	        double volume = Math.PI * radius * radius * height;
	        System.out.println("Volume of the cylinder: " + volume);
	}

}
