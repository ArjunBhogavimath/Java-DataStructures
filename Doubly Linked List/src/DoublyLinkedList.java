
public class DoublyLinkedList {
	Node head;
	int size;
	
	public DoublyLinkedList() {
		head=null;
		size=0;
	}
	
	static class Node{
		int data;
		Node next;
		Node previous;
		
		public Node(int data) {
			previous =null;
			this.data=data;
			next=null;
		}
		public Node(Node previous, int data, Node next){
			this.previous = previous;
			this.data=data;
			this.next=next;
			
		}
		public int Data() {
			return data;
		}
		
	}
	
	public void addBefore(int data) {
		if(isEmpty()) {
			head = new Node(null,data,null);
		}
		else {
			//Previous element is null whenever new element is added
			Node newNode = new Node(null,data,head);
			
			//Linking back to the previous element
			head.previous = newNode;
			//newly added element will be head
			head=newNode;
		}
		size++;
	}
	
	public void addAfter(int data) {
		if(isEmpty()) {
			head = new Node(null,data,null);
		}
		//take the pointer to the end of the list
		else {
			//temporary variable of head
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			//create new node
			Node newNode = new Node(temp,data,null);
			temp.next=newNode;
			
		}
		size++;
	}
	
	public void removeBefore() {
		if(isEmpty()){
			return;
		}
		else {
			head=head.next;
			head.previous=null;
		}
		size--;
	}
	
	public void removeAfter() {
		if(isEmpty()){
			return;
		}
		if(head.next==null) {
			head=null;size--;
			return;
		}
		else {
			Node temp=head;
			while(temp.next.next!=null) {
				temp=temp.next;
			}
			temp.next=null;
			
		}
		size--;
		
	}
	
	//Insert at middle using index
	public void insertAt(int data,int index) {
		if(isEmpty()) {
			return;
		}
		if(index<1 || index>size)
			return;
		else {
			Node temp=head;
			for(int i=0;i<index;i++) {
				temp=temp.next;
			}
			if(temp.previous==null) {
				Node newNode = new Node(null, data, temp);
				temp.previous=newNode;
				head=newNode;
			}
			else {
				Node newNode = new Node(temp.previous,data,temp);
				temp.previous.next=newNode;
				temp.previous=newNode;
			}
		}
		size++;
	}
	public void removeAt(int index) {
		if(isEmpty()) {
			return;
		}
		if(index<1 || index>size)
			return;
		else {
			Node temp=head;
			for(int i=1;i<index;i++) {
				temp=temp.next;
			}
			if(temp.next==null) {
				temp.previous.next=null;
			}
			else if(temp.previous==null) {
				temp=temp.next;
				temp.previous=null;
				head=temp;
			}
			else {
				temp.previous.next=temp;
				temp.next.previous=temp.previous;
			}

			
		}
		size--;
	}
	
	
	public void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public int size() {
		return size;
	}
	
	boolean isEmpty() {
		return head ==null;
	}
	
	
	

}
