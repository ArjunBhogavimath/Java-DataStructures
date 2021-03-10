package BinarySearchTree;


//This class is declared for the tree it self and its consists of root node
public class Tree {
	
	private TreeNode root;
	 
	
	public void insert(int value) {
		//this insert method mainly checks that whether a root is present or not
		//if  not present then it will create new root node and after that it will call the insert method of TreeNode class
		if(root==null) {
			root = new TreeNode(value);
		}
		else {
			root.insert(value);
		}
	}
	
	//InOrder traversal for root element
	public void traverseInOrder() {
		if(root!=null) {
			root.traverseInOrder();
		}
	}
	
	public TreeNode get(int value) {
		//checks if tree is empty or not
		if(root!=null) {
			//return the root element
			return root.get(value);
		}
		// if the tree is empty it returns null
		return null;
	}

}
