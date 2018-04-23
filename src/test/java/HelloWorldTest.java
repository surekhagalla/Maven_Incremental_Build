import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {
	HelloWorld aHelloWorld=new HelloWorld();
	@Test(timeout=12000)
	 public void testMain() {
		assertTrue("Hello Java",true);
	}

}
