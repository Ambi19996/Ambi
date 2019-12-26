package ambifelloship;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	int input=0;
	String primenumber="";
	
	for (int i = 0; i <=1000; i++) {
		int counter=0;
		
		for (input = i; input >=1; input--) {
			if(i%input==0) {
				counter=counter+1;
			}
		}
		if(counter==2) {
			primenumber=primenumber+i;
		}
	}
System.out.println(primenumber);	

}
}
