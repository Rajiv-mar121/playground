package CollectionsPack;

import java.util.List;

public class ListAccess {
	
	ArrayListDemo ald;
	public static void main(String[] args) {
		ListAccess Lacess=new ListAccess();
		Lacess.getList();
	}

	public void getList()
	{
		ald=new ArrayListDemo();
		List li=ald.listAccess();  // Inorder to avoid modification by 3rd class
		System.out.println("ListAccess :"+li);
		li.add("New Add");
		System.out.println("ListAccess after addition :"+li);
		ald.display();
	}
	
}
