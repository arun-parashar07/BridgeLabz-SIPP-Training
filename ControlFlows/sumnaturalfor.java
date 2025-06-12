package aa;
import java.util.*;
public class sumnaturalfor {
	

		public static void main(String[] args) {

			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			if(n<=0) {
				System.out.println("the number "+ n+" is  not natural");
				return;
			}
			
			int Sum=0;
			for(int i =1 ; i<=n;i++) {
				Sum+= i;
			}
			int check=n*(n+1)/2;
			if(Sum==check) {
				 System.out.println("the sum of number usig while and formul is equal" +Sum+" , "+check);
			}
			else {
				 System.out.println("the sum of n natural no is not same their might be an error");
			}

		}

	}

