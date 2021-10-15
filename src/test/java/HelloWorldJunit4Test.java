import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldJunit4Test {

    @Test
    public void getHello() {
        System.out.println("Running junit4 test");
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello World", helloWorld.getHello());
    }
}