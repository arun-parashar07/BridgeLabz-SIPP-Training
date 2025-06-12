//Create a program to check if 3 values are internal angles of a triangle.
package aa;
import java.util.Scanner;
public class SampleProblem1 {
	public static void main(String[] args) {
			Scanner object=new Scanner(System.in);
			System.out.println("Write three Values : ");
			int ang1 = object.nextInt();
			int ang2 = object.nextInt();
			int ang3 = object.nextInt();
			int totalang= ang1 + ang2 + ang2 ;
			if(totalang == 180) {
				System.out.println("These values are from 3 angles of triangle");
			}
			else {
				System.out.println("Invalid Input");
			}
			object.close();
		}
	}
