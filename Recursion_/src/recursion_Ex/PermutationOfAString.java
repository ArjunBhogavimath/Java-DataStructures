package recursion_Ex;
import java.util.*;

public class PermutationOfAString {
	
	static Set<String> set=new HashSet<>();

	public static void main(String[] args) {
		
		
		permutation("abcc",0,2);
		

	}
	//l=left side index of the string
	//r=right side index of the String
	
	//set helps to eliminate repeating strings in the output
	
	
	static void permutation(String s,int l,int r) {
		if(l==r) {
			
			if(set.contains(s)) return;
			set.add(s);
			System.out.println(s);
			return;	
		}
		
		for(int i=l;i<=r;i++) {
			s=interChange(s,l,i);
			permutation(s,l+1,r);
			s=interChange(s,l,i);
		}
		
	}
	
	static String interChange(String s,int a,int b) {
		char arr[]=s.toCharArray();
		char temp= arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
		return String.valueOf(arr);
	}

}
