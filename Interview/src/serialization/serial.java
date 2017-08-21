package serialization;

import java.io.Serializable;

public class serial implements Serializable{
	protected String name="Dhunno";
	private  String age="45";			// If private then can be visible
	protected serial2 serialSecond;
	serial( String name,String age,serial2 serialSecond)
	{
		this.name=name;
		this.age=age;
		this.serialSecond=serialSecond;
	}
}
