package aa;
import java.util.*;
public class sumtill0_1 {
	
	

		public static void main(String[] args) {

			Scanner s = new Scanner(System.in);
			double  total = 0.0;
			double n ;
			 
			while(true) {
				System.out.println("enter 0 to stop");
				n = s.nextDouble();
				if(n==0) 
					break;
				total+=n;
				
			}
			System.out.println("total sum "+ total);
		}

	}

