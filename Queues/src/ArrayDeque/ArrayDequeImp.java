package ArrayDeque;

public class ArrayDequeImp<E> {
	Node<E> head, tail;
	
	public void addToHead(E data) {
		Node<E> toAdd = new Node<>(data);
		
		if(isEmpty()) {
			head=tail=toAdd;
			return;
		}
		//for linking next element
		head.next=toAdd;
		//for linking back element
		toAdd.previous=head;
		head=toAdd;
		
		}
	public E removeLast() {
		if(isEmpty()) {
			return null;
			
		}
		Node<E> toRemove = tail;
		tail=tail.next;
		tail.previous=null;
		toRemove.next=null;
		
		if(tail==null) {
			head=null;
		}
		return toRemove.data;
		
	}
	
	
	public boolean isEmpty() {
		return head==null;
	}
	//Creating a linked list
	public static class Node<E>{
		E data;
		Node<E> next,previous;
		
		public Node(E data){
			this.data=data;
			this.next=this.previous=null;
		}
	}

}
