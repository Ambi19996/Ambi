package ambifelloship;

import java.util.Scanner;

public class Harmonic {
public static void main(String arg[]) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	float harmonic=1;
	for(int i=2;i<=n;i++) {
		harmonic+=(float)1/i;}
		System.out.println(" "+harmonic);
	
	}
}

