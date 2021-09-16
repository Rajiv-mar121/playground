package datastructure;


/**
 * It shows all funtions related with Single Linklist;
 * 
 * @author Rajiv
 *
 */
public class LinkedListDemo {
	Node head=null;
	
	
	class Node {
		int val;
		Node next;

		Node(int val) {
			this.val = val;
		}
	}

	public static void main(String[] args) throws Exception{
		Node n1=new LinkedListDemo().new Node(5);
		Node n2=new LinkedListDemo().new Node(10);
		Node n3=new LinkedListDemo().new Node(15);
		Node n4=new LinkedListDemo().new Node(20);
		Node n5=new LinkedListDemo().new Node(25);
		LinkedListDemo obj=new LinkedListDemo();
		obj.insertNode(n1);
		obj.insertNode(n2);
		obj.insertNode(n3);
		obj.insertAtLast(n4);
		obj.display();
		obj.atPosition(n5,2);
		obj.display();
	}
	
	
	public void insertNode(Node newNode)
	{
		if(newNode==null)
			return;
		if(head==null){
			head=newNode;
			System.out.println("Value inserted head null "+head.val );
			return;
		}
		else{
			
			newNode.next=head;
			head=newNode;
		}
		
		System.out.println("Insertion Completed " );
	}
	
	public void display()
	{
		Node curr;
		if (head==null){
			System.out.println("List is null");
			return;}
		curr=head;
		while(curr!=null)
		{
			System.out.print(curr.val +"-->");
			curr=curr.next;
		}
		System.out.println("NULL");
	}
	
	public void insertAtLast(Node newNode)
	{
		Node curr=head;
		Node priv=null;
		if (newNode==null)
			return;
		
		while(curr!=null)
		{
			priv=curr;
			curr=curr.next;
		}
		System.out.println("inserted after "+priv.val);
		priv.next=newNode;
		
	}

	public void atPosition(Node newNode,int pos)
	{
		if(newNode == null || pos==-1)
			return;
		
		Node curr=head;
		Node priv=null;
		int currPos=0;
		
		while(curr!=null)
		{
			priv=curr;
			curr=curr.next;
			
			if(currPos == pos-1)     // pos-1 is done for insert 
			{
				// Need to insert here;
				newNode.next=curr;
				priv.next=newNode;
			}
			currPos =currPos+1;
		}
	}
}
