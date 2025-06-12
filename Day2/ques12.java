import java.util.*;

public class ques12 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		double base = s.nextInt();
		double height = s.nextInt();
		
		double areaoftri = 0.5*base*height;
		double areaininches = areaoftri/2.54;
		
		System.out.println("The Area of the triangle in sq in is "+ areaininches+ "  and sq cm is "+ areaoftri);

	}

}
