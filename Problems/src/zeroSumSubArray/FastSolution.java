package zeroSumSubArray;
import java.util.*;

//this answer will give op in o(n)
 //and it also uses extra space of o(n) for creation of set


public class FastSolution {

	public static void main(String[] args) {
int a[]= {2,1,-3,4,2};
int k=6;
		
		boolean found=false;
		
		Set<Integer> s=new HashSet<>();
		int sum=0;
		
		for(int element:a) {
			s.add(sum);
			sum+=element;
			if(s.contains(sum-k)) {
				found=true;
				break;
			}
			
		}
		System.out.println("Found = "+found);

	}

}
