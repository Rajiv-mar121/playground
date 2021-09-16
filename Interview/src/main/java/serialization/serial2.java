package serialization;

import java.io.Serializable;

public class serial2 implements Serializable{

	protected String match;
	
	serial2(String match)
	{
		this.match=match;
	}
}

// Must implements Serializable