import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternalizationDemo implements Externalizable {
	
	
	
	String name;
	int age;
	String gender;
	transient String bike;
	static ExternalizationDemo d1;
	
	ExternalizationDemo(String name,int age,String gender,String bike)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.bike=bike;
	}

	public static void main(String[] args) throws Exception{
		 d1=new ExternalizationDemo("Rajiv",28,"male","Karizma");
		 FileOutputStream fos=new FileOutputStream("Exserial");
		 ObjectOutputStream oos=new ObjectOutputStream(fos);
		 d1.writeExternal(oos);
		 Thread.sleep(2000);
		 FileInputStream fis=new FileInputStream("Exserial");
			ObjectInputStream ois=new ObjectInputStream(fis);
			 d1.readExternal(ois);
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		out.writeInt(age);
		out.writeUTF(gender);
		out.writeUTF(bike);
		out.close();
		System.out.println("----Value Externalize --------");
		

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		String name=in.readUTF();
		int age=in.readInt();
		String gender=in.readUTF();
		String bike=in.readUTF();
		in.close();
		System.out.println(name +" "+age+" "+gender+" "+bike);
	}

}
