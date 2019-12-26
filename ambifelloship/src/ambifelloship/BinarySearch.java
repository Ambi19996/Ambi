package ambifelloship;

import java.util.Scanner;

public class BinarySearch {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in );
	System.out.println("enter the array size");
	int n=sc.nextInt();
	System.out.println("Enter the array elements ");
	int[] arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
		}
	System.out.println("Enter the searching element ");
	int f=sc.nextInt();
	int result=BinarySearchNumber(arr,f);
	if(result==-1)
		System.out.println("not present element");
	else 
		System.out.println("present the index "+result);
}

private static int BinarySearchNumber(int[] a, int f) {
	int l=0;int r=0;
	if(r>l) {
	int mid=r+(r-l)/2;

	if(a[mid]==f) 
return mid;		
	
	if(a[mid]>f)
		return BinarySearchNumber(a,l);
	
	else
		return BinarySearchNumber(a,r);
	}
	return -1;
	
}
}
