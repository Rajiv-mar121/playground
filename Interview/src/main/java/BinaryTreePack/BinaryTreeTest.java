package BinaryTreePack;
//http://www.java2s.com/Code/Java/Collections-Data-Structure/BinaryTree.htm
public class BinaryTreeTest {

	public static void main(String[] args) {
		new BinaryTreeTest().run();
	}
	
	/*.......Very important for Interview........*/ 
	
	static class Node{
		int val;
		Node left;
		Node right;
		
		Node(int val)
		{
			this.val=val;
		}
		
	}
	
	public void run()
	{
		Node root=new Node(5);
		System.out.println(" Binary Tree Impl");
		System.out.println("Building tree with root value: " + root.val);
		insertNode(root, 1);
		insertNode(root, 8);
		insertNode(root, 6);
		insertNode(root, 3);
		insertNode(root, 9);
		insertNode(root, 9);
		printInOrder(root);
		findMax(root);
		findMin(root);
		
	}

	public void insertNode(Node rootNode, int val)
	{
		if(val<rootNode.val)
		{
			if(rootNode.left!=null)
			{
				insertNode(rootNode.left,  val);
			}
			else
			{
				System.out.println(" Value inserted at Left :"+val+ " to left of "+rootNode.val);
				rootNode.left=new Node(val);
			}
		}
		else if(val>rootNode.val)
		{
			if(rootNode.right!=null)
			{
				insertNode(rootNode.right,  val);
			}
			else {
				System.out.println(" Value inserted at Right :"+val+ " to Right of "+rootNode.val);
				rootNode.right=new Node(val);
			}
		}
	}
	
	
	
	  public void printInOrder(Node root) {
		    if (root != null) {
		      printInOrder(root.left);
		      System.out.println("  Traversed " + root.val);
		      printInOrder(root.right);
		    }
	  }
	    
	public void findMax(Node root)
	{
		if(root==null)
			return;
		Node curr=root;
		while(curr.right!=null)
		{
			curr=curr.right;
		}
		System.out.println("Max Value ="+curr.val);
	}
	
	public void findMin(Node root)
	{
		if(root==null)
			return;
		Node curr=root;
		while(curr.left!=null)
		{
			curr=curr.left;
		}
		System.out.println("Min Value ="+curr.val);
	}
}