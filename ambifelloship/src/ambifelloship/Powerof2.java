package ambifelloship;

import java.util.Scanner;

public class Powerof2 {
	public static void main(String arg[]) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<=n;i++) {
			int result=(int) (Math.pow(2, i));
			
			System.out.println(" 2 power of " + i + "  " + result);
		}
		
		
	}
	

}
