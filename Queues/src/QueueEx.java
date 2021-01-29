import java.util.LinkedList;
import java.util.Queue;



public class QueueEx {

	public static void main(String[] args) {
	/*	Queue<Integer> q = new LinkedList();
		q.add(21);
		q.add(34);
		q.add(56);
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q.remove());*/
		
		QueueImp<Integer> q=new QueueImp<>();
		
		q.enqueue(45);
		q.enqueue(87);
		q.enqueue(78);
		System.out.println(q.dequeue());
		//System.out.println(q.dequeue());
		//System.out.println(q.dequeue());
		//System.out.println(q.dequeue());
		System.out.println(q.peek());
	}

}
