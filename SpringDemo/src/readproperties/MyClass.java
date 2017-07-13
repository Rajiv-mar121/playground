package readproperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClass {

	String school;
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		MyClass obj=(MyClass)ctx.getBean("myClass");
		System.out.println("School ="+obj.getSchool());
		//ctx.getMessage("greeting",null,"Default greeting",null );
		System.out.println(ctx.getMessage("greeting",null,"Default greeting",null ));
		
		MessageSource source=(MessageSource)ctx.getBean("mySourceManager");
		System.out.println(source.getMessage("greeting",null,"Defaultchk greeting",null ));
	}

}
