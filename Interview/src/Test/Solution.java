package Test;
/*You are given with an array of integers and an integer K. You have to find and print the count of all such pairs which have difference K.
Array : 5 1 2 4
Diff : 3
Ans  : 4,1  and 5,2  (2 pairs)*/



public class Solution {
	public static void main(String[] args) {
		
		int arr[]= {5,2,5,2};
		//int difference = 0;
		Diff(arr);
		
	}
	static void Diff(int arr[]) {
		int len = arr.length;
		//int first = 0;
		//int last = len-1;//
		//int difference = Math.abs(3)
		
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[i] - arr[j] == 3 ) {
					System.out.println(arr[i]+","+arr[j]);
				}
				if(arr[i] - arr[j] == -3) {
					System.out.println(arr[j]+","+arr[i]);
				}
			}
		}
		
	}

}
