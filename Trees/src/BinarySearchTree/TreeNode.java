package BinarySearchTree;

public class TreeNode {
	private int data;
	private TreeNode leftchild;
	private TreeNode rightchild;
	

	//Constructor which accepts data
	public TreeNode(int data) {
		this.data = data;
	}
	
	public void insert(int value) {
		//it will check the duplicates if the duplicate value exists then it will simply return the value
		if(value==data) {
			return;
		}
		// Otherwise if the value is smaller than parent then it will create new left child in left side if there is no root present
		if(value<data) {
			if(leftchild==null) {
				//new node created and value added
				leftchild = new TreeNode(value);
			}
			//otherwise if the left node from the parent is not null means we move to left node from there again we call 
			// -insert leftchild method which checks if there is already a child node or empty then the value willl be added
			else {
				leftchild.insert(value);
			}
		}
		else {
			//If the value is greater than root or parent then the this part will execute
			
			//if there is no node present in right child side then the node will be created
			if(rightchild == null) {
				rightchild = new TreeNode(value);
			}
			//otherwise means the node is not empty then
			//-it will call insert method from that node.
			//again it will check all again and continues
			else {
				rightchild.insert(value);
			}
		}
	}
	
	
	//InOrder traversal. It will return the sorted output
	public void traverseInOrder() {
		if(leftchild != null) {
			 leftchild.traverseInOrder();
		}
		System.out.print(data+", ");
		if(rightchild != null) {
			 rightchild.traverseInOrder();
		}
	}
	
	//get method
	public TreeNode get(int value) {
		
		//if the value is same as data return it
		if(value == data) {
			return this;
		}
		
		//if the value is smaller then check in left sub tree
		if(value < data) {
			//check the left sub tree is not equal to null
			if(leftchild != null) {
				//calling recursive function
				return leftchild.get(value);
			}
			 
		}
		else {
			//if value is greater than parent go to right sub tree
			if(value>data) {
				if(rightchild != null) {
					return rightchild.get(value);
				}
			}
		}
		
		// if the value is does not present in the tree return null
		return null;
	}
	
	
	//Getter and Setter used because the variables and left and right child declared as private and it supports data abstraction
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getLeftchild() {
		return leftchild;
	}

	public void setLeftchild(TreeNode leftchild) {
		this.leftchild = leftchild;
	}

	public TreeNode getRightchild() {
		return rightchild;
	}

	public void setRightchild(TreeNode rightchild) {
		this.rightchild = rightchild;
	}

}
