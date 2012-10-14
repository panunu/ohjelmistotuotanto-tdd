package tdd;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GreeterTest {
        
    private Greeter greeter;
    
    @Before
    public void setUp() {
        greeter = new Greeter();
    }
    
    @Test
    public void greetReturnsHelloForSomeone() {
        assertEquals("hello world", greeter.greet("world"));
    }
    
    @Test
    public void greetWithoutParamatersReturnsHelloStranger() {
        assertEquals("hello stranger", greeter.greet());
    }
}
