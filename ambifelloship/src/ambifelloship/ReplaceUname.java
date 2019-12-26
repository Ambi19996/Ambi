package ambifelloship;

import java.util.HashMap;
import java.util.Scanner;

public class ReplaceUname {
	public static void main(String arg[]) {
		Scanner scaning=new Scanner(System.in);
		String username=scaning.nextLine();
		
		
		String string1="hello {username} how are u?";
		string1=string1.replace("{username}",username);
		System.out.println(""+string1);
	}

}
