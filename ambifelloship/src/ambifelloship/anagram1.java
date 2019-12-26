package ambifelloship;

import java.util.Arrays;

public class anagram1 {
	public static void main(String[] args) {
		String str1="mark";
		String str2="kamr";
		char[] user1=str1.toCharArray();
		char[] user2=str2.toCharArray();
		Arrays.sort(user1);
		Arrays.sort(user2);
		StringBuffer sb=new StringBuffer();
		StringBuffer sb1=new StringBuffer();
		for(int i=0;i<user1.length;i++)
		{
			char a=user1[i];
			char b=user2[i];
			sb.append(a);
			sb1.append(b);
		}
		System.out.println(sb);
		if(sb.toString().equals(sb1.toString())) {
			System.out.println("its is anagram");
		}
		else {
			System.out.println("its is not anagram");
			
		}
	}

}
