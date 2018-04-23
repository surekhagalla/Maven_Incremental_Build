import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloWorldTest {
	HelloWorld aHelloWorld=new HelloWorld();
	
	  @Test(timeout=120000)
	    public void testMain() {
		  assertEquals(aHelloWorld.main(null), "Hello Java1");
	  }

}
