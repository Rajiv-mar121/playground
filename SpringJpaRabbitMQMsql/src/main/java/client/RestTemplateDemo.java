import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.raj.domain.Employee;

public class RestTemplateDemo {

	public static void main(String[] args) {
		RestTemplateDemo rt=new RestTemplateDemo();
		rt.testPost();
		rt.testGet();
	}
	
	public void testPost()
	{
		String url="http://localhost:8085/rabbitmq/list";
		RestTemplate restTemplate=new RestTemplate();
		ResponseEntity<Employee[]> reponse=restTemplate.getForEntity(url, Employee[].class);
		 List<Employee> list=Arrays.asList(reponse.getBody());
		 System.out.println(list);
	}
	
	public void testGet()
	{
		String url="http://localhost:8085/rabbitmq/test";
		RestTemplate restTemplate=new RestTemplate();
		ResponseEntity reponse=restTemplate.getForEntity(url, String.class);
		String list=(String)reponse.getBody();
		 System.out.println(list);
		 
		 String Stringreponse=restTemplate.getForObject(url, String.class);
		 System.out.println(Stringreponse);
	}
	//restTemplate.postForObject
}
