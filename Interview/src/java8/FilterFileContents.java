package java8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FilterFileContents {

	public static void main(String args[]) throws IOException {
		
		File f1 = new File("abc.txt");
		BufferedReader read = new BufferedReader(new FileReader(f1));
		BufferedReader br = Files.newBufferedReader(Paths.get("C://Users//chahnt//Java8Samples//abc.txt"));
		StringBuilder sbr = new StringBuilder();
		String s;
/*		while((s = read.readLine()) != null) {
			sbr.append(s);
		}*/
//		System.out.println(sbr);
//		System.out.println(read.lines().collect(Collectors.toList()));
		List<String> fileRead = read.lines().collect(Collectors.toList());
		List<String> fileRead1 = br.lines().collect(Collectors.toList());
		Long start=System.currentTimeMillis();
		System.out.println(fileRead.stream().filter(str -> str.contains("this") ).count());
		Long end=System.currentTimeMillis();
		Long total=end-start;
		System.out.println(total);
		
		Long start1=System.currentTimeMillis();
		System.out.println("Parallel : "+fileRead1.parallelStream().filter(str -> str.contains("this") ).count());
		Long end1=System.currentTimeMillis();
		Long total1=end1-start1;
		System.out.println(total1);
		
		
		
	}
}
