package serialization;

import static java.lang.System.out;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo implements Serializable{
	
	String name;
	int age;
	String gender;
	transient String bike;
	static SerializationDemo d1;
	serial serialClass;					//java.io.NotSerializableException: serialization.serial
	
	SerializationDemo(String name,int age,String gender,String bike,serial serialClass)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.bike=bike;
		this.serialClass=serialClass;
	}

	public static void main(String[] args) throws Exception{
		 d1=new SerializationDemo("Rajiv",28,"male","Karizma",new serial("Dhunnu","85",new serial2("Siemens")));
		 d1.serialize();
		 d1.deSerialize();
	}
	
	
	public static void serialize() throws Exception
	{
		FileOutputStream fos=new FileOutputStream("serial");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		oos.close();
		oos.flush();
		out.println("----------- Object Serialized--------- ");
		
	}

	
	public static void deSerialize() throws Exception
	{
		FileInputStream fis=new FileInputStream("serial");
		ObjectInputStream ois=new ObjectInputStream(fis);
		SerializationDemo d2=(SerializationDemo)ois.readObject();
		ois.close();
		out.println("-----------De-Serialized--------- ");
		out.println(d2.name);
		out.println(d2.age);
		out.println(d2.gender);
		out.println(d2.bike);    // Transient variable can be serialized but Null value
		out.println(d2.serialClass.name);
	//	out.println(d2.serialClass.age);
		out.println(d2.serialClass.serialSecond.match);
	}
}
