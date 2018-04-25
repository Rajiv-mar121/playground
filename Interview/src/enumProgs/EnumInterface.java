package enumProgs;

public enum EnumInterface implements Runnable{
	
	MONDAY;
	
	public void run()
	{
		System.err.println("Run Method");
	}

}
