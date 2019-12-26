package ambifelloship;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Stopwatch {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("To Start the StopWatch");
		
		String str=sc.next();
		if(str.compareToIgnoreCase("Start")==0) {
			Instant start=Instant.now();
			System.out.println("To Stop the StopWatch");
			String str1=sc.next();
			
			if(str1.compareToIgnoreCase("stop")==0) {
				Instant stop=Instant.now();
				Duration time=Duration.between(start, stop);
				int t=(int) time.toMillis();
				int hour=(int)t/(60*60*1000);
				t=(int)t-hour*(60*60*1000);
				int min=(int)t/(60*1000);
				t=(int)t-min*(60*1000);
				int sec=(int)t/(1000);
				t=(int)t-sec*1000;
				System.out.println(" Hours: "+hour+ "Minues " + "Second " +sec + "time " +t);
			}
			else {
				System.out.println("wrong input");
			}
		}
		else {
			System.out.println("wrong Input");
		}
	}
}