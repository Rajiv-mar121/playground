
public class LinkedListDemo {
	LinkedListDemo n1;
	LinkedListDemo n2;
	LinkedListDemo n3;
	
	static LinkedListDemo list;
	
	LinkedListDemo head=null;
	LinkedListDemo temp;
	Object link;
	int info;
	
	LinkedListDemo(){}
	
	LinkedListDemo(int info)
	{
		this.info=info;
	}
	public static void main(String[] args) {
		list=new LinkedListDemo();
		list.createNodes();
	}
	
	public void createNodes()
	{
		 n1=new LinkedListDemo(10);
		 n2=new LinkedListDemo(20);
		 n3=new LinkedListDemo(30);
		 list.add(n1);
		 list.add(n2);
		 list.add(n3);
		 list.display();
	}
	
	void add(LinkedListDemo node)
	{
		if (head == null)
		{
			head=node;
		}
		else
		{
			node.link=(LinkedListDemo)head;
						
			head=node;
		}
	}

	void display()
	{
		if (head == null)
		{
			System.out.println("Linked List Empty");
		}
		temp=head;

		while(true)
		{
			System.out.print(temp.info +"-->");
			
			if (temp.link == null)
			{
				break;
			}
			temp=(LinkedListDemo)head.link;
			head=temp;
		}
		System.out.print(" Null");
	}
}
