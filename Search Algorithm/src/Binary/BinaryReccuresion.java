package Binary;

public class BinaryReccuresion {

	public static void main(String[] args) {
		int arr[]= {1,2,4,5,7,8,9,34,56};
		int key = 5;
		
		
		if(searchRec(arr,0,arr.length-1,key)>0)
		System.out.println("The key is present at : "+searchRec(arr,0,arr.length-1,key));
		else
			System.out.println("The element is not at all present in array");

	}

	static int searchRec(int arr[],int low,int high,  int key) {
//		
//		if(low==high) {
//			if(arr[low]==key)
//				return low;
//			else
//				return -1;
//		}
//		
		if(high>=low &&low<arr.length-1){
			int mid = low+(high-low)/2;
			
			if(arr[mid]==key)
				return mid;
			if(arr[mid]<key) {
				return searchRec(arr,low,mid-1,key);
			}
			else {
				return searchRec(arr,mid+1,high,key);
			}
		}
		return -1;
		
		
		
	}
}
