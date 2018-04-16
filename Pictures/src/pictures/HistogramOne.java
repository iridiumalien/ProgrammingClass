package pictures;
import java.util.Scanner;

public class HistogramOne {
	public static void main (String[] args) {
	
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter four numbers");
	    int a = scanner.nextInt();
	    int b = scanner.nextInt();
	    int c = scanner.nextInt();
	    int d = scanner.nextInt();
	    
	    	for ( int h = 1; h <= a; h++)
	    		System.out.print("*");
				System.out.println();
	
	    	for ( int h = 1; h <= b; h++)
			System.out.print("*");
			System.out.println();
		
	    
	    	for ( int h = 1; h <= c; h++)
			System.out.print("*");
			System.out.println();
		
	    
	    	for ( int h = 1; h <= d; h++)
			System.out.print("*");
			System.out.println();
		
			scanner.close();
	}
}
