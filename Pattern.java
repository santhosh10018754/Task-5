package task5;
import java.util.*;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range: ");
		int range = sc.nextInt();
		int n = 1;
		for (int i = 0; i <= range; i++) {
			
			for (int j = 0; j < i; j++) {
				
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
		}


	}

}
