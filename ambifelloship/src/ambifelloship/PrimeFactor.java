package ambifelloship;

import java.util.Scanner;

public class PrimeFactor {
	public static void main(String arg[]) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=2;i<=n;i++) {
			while(n%i==0) {
				System.out.println(i+"");
				n=n/i;
			}
			if(n<=1) {
				System.out.println(n);
			}
		}
		
		
		
	}

}
