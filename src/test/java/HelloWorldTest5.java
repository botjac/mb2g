import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest5 {

    @Test
    void getHello() {
        System.out.println("Running junit5 test");
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello World", helloWorld.getHello());
    }
}