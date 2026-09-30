import java.util.function.*;
public class ConsumerInterfaceStringCode {
    public static void main(String[] args) {
        Consumer<String> c = name -> {
            System.out.println("Hi " + name);
        };
        c.accept("ABC");
    }
}
