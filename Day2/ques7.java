import java.util.*;

public class ques7 {

	public static void main(String[] args) {
		
		double radius = 6378;
		double volumekm3 = (4/3)*Math.PI * Math.pow(radius , 3);
		double kmtomiles = 0.621371;
		double volumemiles= volumekm3 * Math.pow(kmtomiles , 3);
		
		System.out.println("The volume of earth in cubic kilometers is "+ volumekm3+ " and cubic miles is " + volumemiles);
		
		
	}

}
