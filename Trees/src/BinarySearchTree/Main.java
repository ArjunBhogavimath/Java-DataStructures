package BinarySearchTree;

public class Main {

	public static void main(String[] args) {
		Tree intTree = new Tree();
		
		int arr[] = {25,20,15,27,30,29,26,22,32};
		
		for(int i=0;i<arr.length;i++) {
			intTree.insert(arr[i]);
		}
		
		//In Order print
		System.out.println("Inorder traversal :");
		intTree.traverseInOrder();
		System.out.println("\n");
		
		//Pre order
		System.out.println("Preorder traversal :");
		intTree.traversePreOrder();
		System.out.println("\n");
		
		//Post order
				System.out.println("Postorder traversal :");
				intTree.traversePostOrder();
				System.out.println("\n");
		
		
		System.out.println(intTree.get(20));
		System.out.println(intTree.get(32));
		System.out.println(intTree.get(222));
		
		System.out.println("Minimum value : "+intTree.min());
		System.out.println("\n");
		System.out.println("Maximum value : "+intTree.max());
		
		System.out.println("\n");
		//intTree.delete(15);
		intTree.delete(20);
		intTree.traverseInOrder();
		System.out.println("\n");


	}

}
