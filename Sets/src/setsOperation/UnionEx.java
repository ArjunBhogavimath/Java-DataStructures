package setsOperation;
import java.util.*;
public class UnionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> x=new HashSet<>();
		
		x.add(23);
		x.add(45);
		x.add(1);
		
		Set<Integer> y = new HashSet<>();
		
		y.add(1);
		y.add(14);
		y.add(78);
		
		//union operation
		
		x.addAll(y);
		System.out.println(x);

	}

}
