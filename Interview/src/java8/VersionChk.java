package java8;

import java.lang.management.ManagementFactory;

public class VersionChk {

	public static void main(String[] args) {
		System.out.println("Rajiv : "+ManagementFactory.getRuntimeMXBean().getVmVersion());
		String s=System.getProperty("java.version");
		System.out.println("Rajiv version: "+s);
	//	ManagementFactory.getRuntimeMXBean().getVmVersion();
	}

}
