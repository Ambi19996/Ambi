package ambifelloship;

import java.util.Scanner;

public class BubbleSort {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Array Size");
	int n=sc.nextInt();
	System.out.println("Enter the array");
	int a[]=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	
	Bubble(a);
	System.out.println(a[0]);
}

private static int[] Bubble(int[] a) {
	
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length-1-j;j++) {
			if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
			printing(a);
		}
	}
	
	return a;
	
	
}

private static void printing(int[] a) {
	for(int i=0;i<a.length;i++) {
		System.out.print(" "+a[i]);
	}
	System.out.println(" ");
}

}
