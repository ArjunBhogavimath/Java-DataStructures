package hashmapex;
import java.util.*;

import java.util.Map.Entry;


public class HashMapEx {

	public static void main(String[] args) {
		Map<Integer,String> num = new HashMap<>();
		
		num.put(1, "One");
		num.put(2, "Two");
		num.put(3, "Three");
		//only adds when the key is absent
		num.putIfAbsent(5,"ten" );
		
		num.replace(1, "one-hundred");
		
		num.replace(3, "Three", "Three-hundred");
		
		 // num.remove(1);
		
		
		System.out.println(num);
		System.out.println(num.get(3));
		System.out.println(num.containsKey(5));
		System.out.println(num.containsValue("ten"));
		System.out.println(num.keySet());
		System.out.println(num.values());
		System.out.println(num.entrySet());
		
		
		//to iterate each item in the set
		
		Set<Entry<Integer, String>> entries = num.entrySet();
		
		//each item value can be modified while iterating over them
		 for(Entry<Integer, String> entry: entries) {
			entry.setValue(entry.getValue().toUpperCase());
		}
		
		 System.out.println(num);
		

	}

}
