import java.util.*;
public class StackEx {

	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<>();
		s.push(12);
		s.push(34);
		s.push(39);
		int pop = s.pop();
		int peeked = s.peek();
		System.out.println(pop);
		System.out.println(peeked);

	}

}
