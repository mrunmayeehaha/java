import java.util.function.*;
public class FunctionInterfaceStringCode {
    public static void main(String[] args) {
        Function<String,Integer> s = str -> str.length();
        System.out.println(s.apply("JAVA"));
    }
}

