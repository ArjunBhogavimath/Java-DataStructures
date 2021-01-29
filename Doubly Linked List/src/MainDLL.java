
public class MainDLL {

	public static void main(String[] args) {
		
			DoublyLinkedList obj = new DoublyLinkedList();
			
			obj.addBefore(10);
			obj.addBefore(8);
			obj.addBefore(6);
			obj.print();
			System.out.println("before up----------after down");
			obj.addAfter(12);
			obj.addAfter(14);
			obj.addAfter(16);
			obj.print();
			System.out.println("The Size is :"+obj.size());
			obj.removeBefore();
			//obj.removeAfter();
			obj.print();
			System.out.println("After removing back: "+obj.size);
			obj.removeAfter();
			obj.print();
			System.out.println("After removing front: "+obj.size);
			obj.insertAt(34, 3);
			obj.print();
			System.out.println("The Size is :"+obj.size());
			System.out.println("before removeAt");
			obj.removeAt(2);
			obj.print();
			System.out.println("The Size is :"+obj.size());
			
			

	}

}
