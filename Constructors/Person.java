package Java_Constructor;
import java.util.*;

class person1{
	String name;
	int id;
	String gender;
	person1(){
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter the name of a person ");
		this.name= sc.next();
		System.out.println(" Enter the id of a person ");
		this.id=sc.nextInt();
		System.out.println(" Enter the sex of a person ");
		this.gender=sc.next();	
		sc.close();
	}
	 
	person1(person1 c){
		this.name=c.name;
		this.id=c.id;
		this.gender=c.gender;
	}
	void display() {
		System.out.println("the attributes of person : Name: "+name+" id :"+id+" and the Sex: "+gender);
	}
}
public class Person {
	public static void main(String []args) {
		person1 obj=new person1();
		obj.display();
		
		person1 obj1=new person1(obj);
		obj1.display();
	}
}
