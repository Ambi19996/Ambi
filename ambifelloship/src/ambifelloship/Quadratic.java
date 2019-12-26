package ambifelloship;

import java.util.Scanner;

public class Quadratic {
	public static void main(String arg[]) {
		Scanner scan=new Scanner(System.in);
		double a=scan.nextInt();
		double b=scan.nextInt();
		double c=scan.nextInt();
		
		double delta = (double) b*b - 4*a*c;
	   double 	x = ((-b + (double)Math.sqrt(delta))/(2*a));
		double x1 =  ((-b -(double)Math.sqrt(delta))/(2*a));
		 System.out.println("the distance is "+ x);
		 System.out.println("the distance is "+ x1);
	}

}
