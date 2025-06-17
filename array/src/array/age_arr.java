package array;
import java.util.*;
public class age_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int age[] = new int[10];
		for(int i=0;i<10;i++) {
			System.out.println("engter the age of "+(i+1)+" student");
			age[i]=s.nextInt();
		}
		for(int i=0;i<age.length;i++) {
			if(age[i]<=0) {
				System.out.println("invalid age of student "+(i+1));
			}
			else if(age[i]>=18) {
				System.out.println("the studen "+(i+1)+" is eligile ");
			}
			else {
				System.out.println("the studen "+(i+1)+" is not eligile ");
			}
				
		}
		s.close();
	}

}
