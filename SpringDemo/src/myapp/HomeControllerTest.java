package myapp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
//import spittr.web.HomeController;

public class HomeControllerTest {
	
	//@AutoWire
	HomeController cntrl;
	
	@Test
	public void testHomePage() throws Exception {
		HomeController controller = new HomeController();
		assertEquals("home", controller.home());
	}
	
	
	@Test
	public void testHomePage1() throws Exception {
		HomeController controller = new HomeController();
		assertEquals("home", controller.home());
	}
}