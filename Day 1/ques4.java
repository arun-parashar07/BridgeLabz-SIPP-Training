//Write a program to calculate the area of a circle. Take the radius as input
//and use the formula:
//Area = π * radius^2.
package com.tech;
import java.util.Scanner;
public class ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
	}

}
