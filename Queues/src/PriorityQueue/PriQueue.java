package PriorityQueue;
import java.util.*;
public class PriQueue {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		
		pq.add("Cycle");
		pq.add("Apple");
		pq.add("Mango");
		pq.add("Dog");
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		

	}

}
