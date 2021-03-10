package BinarySearchTree;

public class Main {

	public static void main(String[] args) {
		Tree intTree = new Tree();
		
		int arr[] = {25,20,15,27,30,29,26,22,32};
		
		for(int i=0;i<arr.length;i++) {
			intTree.insert(arr[i]);
		}
		System.out.println("Inorder traversal :");
		intTree.traverseInOrder();
		System.out.println("\n");
		
		
		System.out.println(intTree.get(20));
		System.out.println(intTree.get(32));
		System.out.println(intTree.get(222));
		
		
		

	}

}
