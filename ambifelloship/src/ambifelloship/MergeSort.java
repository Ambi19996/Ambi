package ambifelloship;

public class MergeSort {
	static int a[]= {45,22,1,77,5,66,77,0};
	public static void main(String[] args) {
		
		System.out.println("Before the Merging ");
		Printing(a,0,a.length-1);
		System.out.println("*******************");
		Sort(a,a.length-1);
		System.out.println("After the Merging ");
		Printing(a,0,a.length-1);
		
	}

	private static void Sort(int start, int end) {
		int mid=start+end/2;
		if(start<end) {
			Sort(start, mid);
			Sort(mid+1, end);
			MergeSort(start,mid,end);
            			
		}
	}

	private static void MergeSort(int start, int mid, int end) {
		int tem[]=new int[a.length];
		int temparray=start;
		System.out.println("Before the merge");
		Printing(a,mid,end);
		int startindex=start;
		int midindex=mid+1;
	while(startindex<=mid&&midindex<=end) {
		if(a[startindex]<a[midindex]) {
			tem[temparray++]=a[startindex++];
		}
		else {
			tem[temparray++]=a[midindex++];
		}
	}
	while(startindex<=mid) {
		tem[temparray++]=a[startindex++];
		
	}
		while(midindex<end) {
			tem[temparray++]=a[midindex++];
		}
		for(int i=start;i<=end;i++) {
			a[i]=tem[i];
		}
		System.out.println("after the merging");
		Printing(tem,start,end);
		System.out.println("########");
	}

	private static void Printing(int[] tem, int start, int end) {
		for(int i=start;i<=end;i++) {
		
			System.out.print(a[i]);
			
		}
		System.out.println();
	}

}
