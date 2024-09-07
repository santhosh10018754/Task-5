package task5;

import java.util.Scanner;

public class Biggest { 
	
	private static Scanner sc;

	public static void main(String[] args) {
		int x,y,z;
		sc=new Scanner(System.in);
		System.out.println("Enter three different values:");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		
		if (x > y && x >z) {
			System.out.println("x is greater than x and y " );
		}
		else if(y > x && y > z) {
			System.out.println("y is greater than x and z " );
		}
		else if (z > x && z > y) {
			System.out.println("z is greater than x and y " );
		}
		else {
			System.out.println("Either any two values or all three values are equal");
		}

	}

}
