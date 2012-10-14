package tdd;

public class Greeter {
    
    public String greet() {
        return greet("stranger");
    }
    
    public String greet(String someone) {
        return "hello " + someone;
    }
    
}
