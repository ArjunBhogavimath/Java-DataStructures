package implementation;

public class Main {

	public static void main(String[] args) {
		Heap heap = new Heap(10);
		
		int arr[]= {80,75,60,68,55,40,52,67};
		
		for(int i=0;i<arr.length;i++) {
			heap.insert(arr[i]);
		}
		heap.printHeap();
		System.out.println(heap.peek());
		
		heap.delete(1);
		heap.printHeap();
		System.out.println(heap.peek());
	}

}
