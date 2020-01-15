// Exercise 1.5: Change the HelloWorld application to use a named string constant 
// as the string to print. (A string constant can be initialized with a string literal.)

public class HelloWorld {
    private static final String str = "Hello, World!";
    
    public static void main(String[] args) {
        System.out.println(str);
    }
}
