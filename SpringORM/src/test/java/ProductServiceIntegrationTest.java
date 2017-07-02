import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.spring.config.PersistenceJPAConfig;
import com.spring.model.Product;
import com.spring.service.ProductService;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes={PersistenceConfig.class}, loader=AnnotationConfigContextLoader.class)
@ContextConfiguration(classes={PersistenceJPAConfig.class}, loader=AnnotationConfigContextLoader.class)
public class ProductServiceIntegrationTest {

	@Autowired
	private ProductService productervice;
	
	@Test
	public void producterviceNotNull()
	{
		assertNotNull(productervice);
	}
	
	@Test
	public void entityCreate()
	{
		productervice.add(new Product(1, "RajDijone mustard"));
	//	productervice.add(new Product(1, "RajDijone mustard"));
		productervice.add(new Product(2, "DhunnoDijone mustard"));
		System.out.println("listAll: " + productervice.listAll());
	}
}
