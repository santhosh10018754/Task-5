package task5;

public class Star {

	public static void main(String[] args) {
		 for (int i = 0; i < 5; i++) {
			    
             if (i == 0 || i == 4) {
                 System.out.println("*    *");
             } else if(i == 1 || i == 3) {
                 System.out.println(" * * ");
             }else {
					System.out.println("  * ");
				}
         
     }


	}

}
