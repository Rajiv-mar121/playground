package enumProgs;


enum DaysOutside implements Runnable{
	Moday,Tuesday ;
	
	public void run()
	{
		System.out.println("Inside Run ....");
	}
}

public class enmTest {

	enum Days{
		WednesDay,Thrusday
	}
	
	public static void main(String[] args) {
		System.out.println(Days.Thrusday.ordinal());
		System.out.println(DaysOutside.valueOf("Moday"));
		Thread t=new Thread(DaysOutside.Moday,"Enum");
		t.start();
	//	DaysOutside.Moday.st
	}

}
