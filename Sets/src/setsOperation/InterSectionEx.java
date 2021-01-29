package setsOperation;

import java.util.HashSet;
import java.util.Set;

public class InterSectionEx {

	public static void main(String[] args) {
Set<Integer> x=new HashSet<>();
		
		x.add(23);
		x.add(45);
		x.add(1);
		
		Set<Integer> y = new HashSet<>();
		
		y.add(1);
		y.add(14);
		y.add(78);
		
		//Intersection operation
		
		x.retainAll(y);
		System.out.println(x);

	}

}
