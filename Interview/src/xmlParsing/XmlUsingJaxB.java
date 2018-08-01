package xmlParsing;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class XmlUsingJaxB {

	public static void main(String[] args) {
		XmlUsingJaxB obj=new XmlUsingJaxB();
		obj.marshall();
		obj.unMarshall();
	}

	public void marshall()
	{
		try {
			Employee empObject=new Employee("Rajiv", "30", "Sarjapur", "CV RamanNagar", 100000);
			JAXBContext jc=JAXBContext.newInstance(Employee.class);
			Marshaller ms=jc.createMarshaller();
			ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			ms.marshal(empObject, System.out);
			ms.marshal(empObject, new File("C:\\Users\\Rajiv\\git\\playground\\Interview\\resource\\emp.xml"));
			//src\\xmlParsing\\emp.xml
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public void unMarshall()
	{
		try {
			JAXBContext jc=JAXBContext.newInstance(Employee.class);
			Unmarshaller ums=jc.createUnmarshaller();
			Employee emp=(Employee)ums.unmarshal(new File("C:\\Users\\Rajiv\\git\\playground\\Interview\\resource\\emp.xml"));
			System.out.println("Employee Information :");
			System.out.println("Name : "+emp.getName());
			System.out.println("Age : "+emp.getAge());
			System.out.println("Name : "+emp.getAddress());
			System.out.println("Name : "+emp.getSal());
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
