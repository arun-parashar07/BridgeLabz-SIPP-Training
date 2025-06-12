package aa;
import java.util.*;
public class sumnatutalwhile {
	

		public static void main(String[] args) {

			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			if(n<=0) {
				System.out.println("the number "+ n+" is  not natural");
				return;
			}
			
			int Sum=0;
			int i=1;
			while(i<=n) {
				 Sum += i;
				 i++;
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


