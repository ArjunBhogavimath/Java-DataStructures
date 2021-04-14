package Test;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
/*"Given an array with duplicates in random order ,return sorted list with distinct elements
I: 4 3 2 3 4 0 8 1
O: 1 2 3 4 8"*/

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 4 ,3 ,2 ,3 ,4, 0, 8, 1} ;
		Set<Integer> set = new HashSet<>();
		for(int i =0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		System.out.println(set);

	}

}
