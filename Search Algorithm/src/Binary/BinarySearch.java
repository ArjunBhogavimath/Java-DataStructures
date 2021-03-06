package Binary;


//Only works on sorted  array;
//the time complexity is O(logn) and space is 0(1)
public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {1,2,4,5,7,8,9,34,56};
		int key = 91;
		
		if(search(arr,key)>0)
		System.out.println("The key is present at : "+search(arr,key));
		else
			System.out.println("The element is not at all present in array");
	}
	
	static int search(int arr[],int key) {
		int len = arr.length;
		int low = 0;
		int high = len;
		
		while(low<len) {
			int mid = (low+high)/2;
			
			if(arr[mid]==key)
				return mid;
			if(arr[mid]<key) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return -1;
		
	}

}
