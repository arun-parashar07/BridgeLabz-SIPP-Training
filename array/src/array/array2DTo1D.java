package array;
import java.util.*;
public class array2DTo1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[][] arr= new int[3][2];
		int ar[]=new int[6];
		for(int i = 0;i<3;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j] = s.nextInt();				
			}
			
		}
		int index= 0;
		for(int i = 0;i<3;i++) {
			for(int j=0;j<2;j++) {
				ar[index] = arr[i][j];	
				index++;
			}
			
		}
		for(int i = 0 ; i < ar.length ; i++) {
			System.out.print(ar[i]+" " );
		}
		s.close();
	}

}
