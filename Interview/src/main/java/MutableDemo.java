import java.util.HashMap;

public final class MutableDemo {
	
	final private String pancard;
	private final int id;
	private final HashMap<String,String> testMap;
	
	public String getPancard() {
		return pancard;
	}


	public int getId() {
		return id;
	}


	public HashMap<String, String> getTestMap() {
		
		//return testMap;
		return (HashMap<String, String>)testMap.clone();
	}


	
	
	MutableDemo(String pancard,int id,HashMap<String,String> testMap){
		this.pancard=pancard;
		this.id=id;
		this.testMap=testMap;
	}

	
	public static void main(String[] args) {
		HashMap<String, String> h1 = new HashMap<String,String>();
		h1.put("1", "first");
		h1.put("2", "second");
		String pan="BCPPK4345C";
		int id=10;
		MutableDemo m1=new MutableDemo(pan,id,h1);
		System.out.println(pan==m1.getPancard());
		System.out.println(id == m1.getId());
		System.out.println(h1 == m1.getTestMap());
		
		System.out.println("m1 testMap:"+m1.getTestMap());
		System.out.println("h1 testMap:"+h1);
		
		HashMap<String,String> map=m1.getTestMap();
		map.put("3","Modified");
		
		System.out.println("m1 testMap after editing :"+m1.getTestMap());
		System.out.println("h1 main map :"+h1);
		System.out.println("h1 main map :"+m1.pancard);
		
	//	m1.pancard="Rajiv"; 
	}
}


//https://dzone.com/articles/creating-immutable-classes-such-as-string-class
/*Declare the class as final so it can’t be extended.
Make all fields private so that direct access is not allowed.
Don’t provide setter methods for variables
Make all mutable fields final so that it’s value can be assigned only once.
Initialize all the fields via a constructor performing deep copy.
Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.*/