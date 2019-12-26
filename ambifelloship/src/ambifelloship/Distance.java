package ambifelloship;

import java.util.Scanner;

public class Distance {
	public static void DistancePrinting(int x,int y) {
		
		double total=Math.sqrt(x*x+y*y);
		 System.out.println("the distance is "+ total);
	}
public static void main(String arg[]) {
	Scanner scan=new Scanner(System.in);
	int x=scan.nextInt();
	int y=scan.nextInt();
	DistancePrinting(x,y);
	
}
}
