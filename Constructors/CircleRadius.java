package Java_Constructor;
import java.util.*;

class Circle{
	double radius;
	
	Circle(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Radius");
		this. radius = sc.nextDouble();
		sc.close();
	}
	Circle(double radius){
		this.radius=radius;
	}
	void display() {
		System.out.println(radius);
	}
}

public class CircleRadius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj=new Circle();
		obj.display();
		
		Circle obj1=new Circle(10.1);
		obj1.display();
	}

}
