package ambifelloship;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class dayofweek {
	public static void main(String[] args) {
		Map<Integer,String>map=new HashMap<Integer,String>();
		map.put(0, "Sunday");
		map.put(1, "monday");
		map.put(2, "Tuesday");
		map.put(3, "Wednesday");
		map.put(4, "Thursday");
		map.put(5, "Friday");
		map.put(6, "Saturday");
		
		int y0,x,m0,d0;
		Scanner scan=new Scanner(System.in);
		int  y=scan.nextInt();
		int m=scan.nextInt();
		int d=scan.nextInt();
		 y0 = y − (14 − m) / 12;
		 x = y0 + y0/4 − y0/100 + y0/400;
		 m0 = m + 12 * ((14 − m) / 12) −2;
		 d0 = (d + x + 31*m0 / 12) % 7;

	}}