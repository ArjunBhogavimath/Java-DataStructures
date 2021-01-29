import LinkedList.LinklistRef.Node;

//import LinkedListGen.Node;

public class QueueImp<E> {
	
	public Node<E> head, rear;
	
	public void enqueue(E e) {
		
		//Let me 1st create a node to store the data
		Node<E> toAdd = new Node<>(e);
		//check is the list is empty or not
		if(head==null) {
			head=rear=toAdd;
			return;
		}
		rear.next =toAdd;
		rear=rear.next;
		
	}
	
	public E dequeue() {
		if(head==null) {
			return null;
		}
		if(head==null) {
			rear= null;
		}
		Node<E> temp = head;
		head = head.next;
		return temp.data;
		
	}
	
	public E peek() {
		return head.data;
	}

}
