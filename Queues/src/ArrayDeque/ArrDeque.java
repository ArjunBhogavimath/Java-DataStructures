package ArrayDeque;

import java.util.ArrayDeque;

public class ArrDeque {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		
		//Queue methods
		/*ad.addFirst(21);
		ad.addFirst(12);
		ad.addFirst(86);
		ad.addFirst(78);
		//ad.pop();
		System.out.println(ad.peek());
		*/
		
		//Stack Methods
		ad.push(21);
		ad.push(34);
		ad.push(45);
		ad.push(78);
		ad.pop();
		System.out.println(ad.peek());
	}

}
