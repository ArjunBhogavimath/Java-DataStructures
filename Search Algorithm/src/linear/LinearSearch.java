package linear;

//The linear searching method uses O(n) time complexity and O(1) space.
public class LinearSearch {

	public static void main(String[] args) {
		int arr[]= {1,2,4,5,7,8,9,34,56};
		int key = 4;
		
		if(linear(arr,key)>0)
			System.out.println("The key is present at : "+linear(arr,key));
			else
				System.out.println("The element is not at all present in array");

	}
   public static int linear(int arr[], int key) {
	   for(int i=0;i<arr.length;i++) {
		   if(arr[i]==key)
			   return i;
	   }
	   return -1;
   }
}
