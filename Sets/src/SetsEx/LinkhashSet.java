package SetsEx;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkhashSet {

	public static void main(String[] args) {
		
		//Insertion order is preserved
		//uses linkedlist to store data
			Set<String> fruits =new LinkedHashSet<>();
			fruits.add("Apple");
			fruits.add("Banana");
			fruits.add("Mango");
			fruits.add("Orange");
			
			
			fruits.add("Banana");
			
			System.out.println(fruits);
		

	}

}
