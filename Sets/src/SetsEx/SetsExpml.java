package SetsEx;
import java.util.*
;
public class SetsExpml {

	public static void main(String[] args) {
		Set<String> s=new HashSet<>();
		s.add("Apple");
		s.add("Banana");
		s.add("Mango");
		s.add("Orange");
		
		
		s.add("Banana");
		
		System.out.println(s);
	}

}


//order is not preserved
//no duplicate is allowed