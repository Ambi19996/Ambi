package ambifelloship;

import java.util.Scanner;

public class Permutations {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	PrintPermutation(str, "");
}

private static void PrintPermutation(String str,String ans) {
	
	if(str.length()==0) {
		System.out.println(""+ans);
		return;
	}
	
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
	
	String str1=str.substring(0,i)+str.substring(i+1);
	PrintPermutation(str1, ch+ans);
	}
}
}
