package aa;
import java.util.Scanner;
public class factorial {



		public static void main(String[] args) {

			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int fac=1;
			
			if(n>0) {
				for(int i=1;i<=n;i++) {
					fac*= i;
				}
				System.out.println("the number is natural "+n+ " and the factorial oh no is "+fac);
			}
			else {
				System.out.println("the number is not a natural");
			}
			
		}
}
