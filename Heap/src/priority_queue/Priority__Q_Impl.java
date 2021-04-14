package priority_queue;

//import java.util.Objects;
import java.util.PriorityQueue;

public class Priority__Q_Impl {

	public static void main(String[] args) {
		PriorityQueue<Integer> q = new PriorityQueue<>();
		
		q.add(20);
		q.add(-22);
		q.add(456);
		q.add(-2);
		q.add(54);
		
		//This is how the value stored in the array
		Object[] nums =  q.toArray();
		for(Object num:nums) {
			System.out.print(num+",");
		}
		System.out.println();
		
		//It will print the minimum value 
		//because it is implemented by min heap
		// so the min value will be in the root.
		System.out.println(q.peek());
		
		//this will remove the top/root
		System.out.println(q.remove());
		
		//after removing root the next smallest will become the root
		System.out.println(q.peek());
		
		//its also works same as poll
		System.out.println(q.poll());
		
		System.out.println(q.peek());
		
		//basically remove is used to remove specific element while poll removes the root
		System.out.println(q.remove(54));
		System.out.println(q.peek());
		
		//adding a new element
		q.add(-1);
		System.out.println(q.peek());

	}

}
