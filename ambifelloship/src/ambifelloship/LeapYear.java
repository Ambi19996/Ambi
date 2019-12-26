package ambifelloship;

import java.util.Scanner;

public class LeapYear {
	public static void main(String arg[]) {
		Scanner scan=new Scanner(System.in);
		int year=scan.nextInt();
		
		if(year%400==0||year%4==0) {
			System.out.println("its is leapyear");
			
		}
		else{
			System.out.println("its is notleapyear");	
		}
		
	}

}
