package ambifelloship;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Gamber {
public static void main(String arg[]) {
 Scanner scan=new Scanner(System.in);
 Random random=new Random();
 int stack=random.nextInt();
 int goal=scan.nextInt();
 int trials=scan.nextInt();
 int balance=10;
 int bet=random.nextInt();
 int win=0;
 
 for(int i=0;i<trials;i++) {
	 int cash=stack;
	 int star=0;
	 while(cash>0&&cash<goal) {
		 bet++;
		 if(Math.random()<0.5)
		 cash++;
		 else
			 cash--;
		 while(star<=cash) {
			 System.out.println("$");
			 star++;
		 }
		 System.out.println();
	 }
	 if(cash==goal) {
		 win++;
	 }
 }
 System.out.println(trials);
 System.out.println(100*win/trials);
 System.out.println(1.0*bet/trials);
}
}











