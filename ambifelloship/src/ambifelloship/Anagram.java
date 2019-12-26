package ambifelloship;

import java.util.Scanner;

public class Anagram {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str= "heart";
	String str2="earths";
	
	if(Anagram(str,str2)) {
		System.out.println("ita is angram");
		
	}
	else {
		System.out.println("ita is notangram");
	}
	
	
}	
		

private static boolean Anagram(String str1,String str21) {

	
	
	
	char[] str4=str1.toCharArray();
	char[] str3=str21.toCharArray();
	
for (int i = 0; i < str4.length; i++)
{
	for (int j = 0; j < str3.length; j++) 
	{
		if (str4[i]!=str3[j]) {
			
		}
			
			}
		}
return true;
		
	}
}


	
	

			
	
	


