package array;
import java.util.*;

public class fact_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int ar[]= new int[n+1];
		
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				ar[i]= 1;
			}
			
		}
		System.out.print("array of factors is : ");
		for(int i = 1 ; i <=n ; i++) {
			if(ar[i] == 1) {
				System.out.print(i + " ");
			}
		}
		System.out.print(n);
		s.close();
	}

}
