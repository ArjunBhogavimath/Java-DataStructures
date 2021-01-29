package setsOperation;

import java.util.HashSet;
import java.util.Set;

public class SubsetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Integer> x=new HashSet<>();
		
		x.add(23);
		x.add(45);
		x.add(1);
		
		Set<Integer> y = new HashSet<>();
		
		y.add(1);
		
		
		//subset operation
		
		System.out.println(x.containsAll(y));
		System.out.println(y.containsAll(x));

	}

}
