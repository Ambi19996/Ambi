package ambifelloship;

import java.util.Scanner;

public class InsertionSort {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int n=sc.nextInt();
	System.out.println("enter thde arrays");
	int a[]=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	Sorting(a);
	Printing(a);
	}

private static void Sorting(int[] a) {
	int n=a.length;
	for(int i=1;i<n;i++) {
		int keys=a[i];
		int k=i-1;
		while(k>=0&&a[k]>keys) {
         a[k+1]=a[k];
         k=k-1;
		}
		a[k+1]=keys;
	}
}

private static void Printing(int[] a) {
	int n=a.length;
	for(int i=0;i<n;i++) {
		System.out.print(a[i]);
		System.out.println();
	}
	
}}
