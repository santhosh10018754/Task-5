package task5;
import java.util.*;
public class Grade {

	public static void main(String[] args) {
	    
	        System.out.print("Enter Your Mark: ");
	        Scanner sc = new Scanner(System.in);
	        int mark = sc.nextInt();
	        System.out.println("Your Grade");

	        int grade = (mark >= 90) ? 1 : (mark >= 80) ? 2 : (mark >= 70) ? 3 : (mark >= 60) ? 4 : (mark >= 50) ? 5 : 6;

	        switch (grade) {
	            case 1:
	                System.out.print("A");
	                break;
	            case 2:
	                System.out.print("B");
	                break;
	            case 3:
	                System.out.print("C");
	                break;
	            case 4:
	                System.out.print("D");
	                break;
	            case 5:
	                System.out.print("E");
	                break;
	            default:
	                System.out.print("F");
	        }
	    }
	}



	


