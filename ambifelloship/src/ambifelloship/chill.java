package ambifelloship;

import java.util.Scanner;

public class chill {
	public static void main(String[] arg) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		int v=scan.nextInt();
		check(t,v);
	}

	private static void check(int t, int v) {
		double w= (35.74+0.6215*t+(0.4275*t-35.73)*Math.pow(v, 0.16));
		System.out.println("Temparature=" +t);
	    System.out.println("Wind Speed=" +v);
	    System.out.println("Wind Chill=" +w);
	}
}
