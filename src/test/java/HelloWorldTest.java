import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void getHello() {
        HelloWorld helloWorld = new HelloWorld();
        assert ("Hello World".equals(helloWorld.getHello()));
    }
}