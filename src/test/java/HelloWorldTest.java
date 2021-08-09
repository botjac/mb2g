import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void getHello() {
        System.out.println("Running junit test");
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello World", helloWorld.getHello());
    }
}