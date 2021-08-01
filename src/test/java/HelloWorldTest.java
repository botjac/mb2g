import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void getHello() {
        HelloWorld helloWorld = new HelloWorld();
        assert ("Hello World".equals(helloWorld.getHello()));
    }
}