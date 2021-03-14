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
	
	//Pre-Order traversal
	public void traversePreOrder() {
		if(root!=null) {
			root.traversePreOrder();
		}
	}
	
	public void traversePostOrder() {
		if(root!=null) {
			root.traversePostOrder();
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
	
	//delete
	public void delete(int value) {
		root=delete(root,value);
	}
	
	private TreeNode delete(TreeNode subtreeRoot,int value) {
		if(subtreeRoot==null) {
			return subtreeRoot;
		}
		
		
		if(value<subtreeRoot.getData()) {
			subtreeRoot.setLeftchild(delete(subtreeRoot.getLeftchild(),value));
		}
		else if(value>subtreeRoot.getData()) {
			subtreeRoot.setRightchild(delete(subtreeRoot.getRightchild(),value));
		}
		else {
			//cases 1 and 2 : node to be deleted that has 0 or 1 children
			if(subtreeRoot.getLeftchild()==null) {
				return subtreeRoot.getRightchild();
			}
			else if(subtreeRoot.getRightchild()==null) {
				return subtreeRoot.getLeftchild();
			}
			
			//case 3: node to be deleted has 2 children
			
			//replace the value in the subtree node  witrh smallest value 
			//from the right subtree
			subtreeRoot.setData(subtreeRoot.getRightchild().min());
			
			//delete the node that  has the smallest value in the rigth subtree
			subtreeRoot.setRightchild(delete(subtreeRoot.getRightchild(),subtreeRoot.getData()));
		}
		return subtreeRoot;
	}
	
	

	//min and max
	public int min() {
		if(root==null) {
			return Integer.MAX_VALUE;
		}
		else {
			return root.min();
		}
	}
	
	public int max() {
		if(root==null) {
			return Integer.MAX_VALUE;
		}
		else {
			return root.max();
		}
	}
}
