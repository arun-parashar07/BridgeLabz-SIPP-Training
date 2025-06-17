
package ControlflowLevel1;

import java.util.Scanner;

public class Sumtotal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double total = 0.0; 
        double number;      
        System.out.print("Enter a number (0 to stop): ");
        number = scanner.nextDouble();

        while (number != 0) {
            total += number; 
            System.out.print("Enter another number (0 to stop): ");
            number = scanner.nextDouble(); // Input again
        }

        System.out.println("The total sum is: " + total);
        
        scanner.close();
    }
}
