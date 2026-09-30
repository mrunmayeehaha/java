import java.util.function.*;
public class FunctionInterfaceInteger {
    public static void main(String[] args) {
        Function<Integer,Integer> f = n -> n * n;
        System.out.println(f.apply(3));
    }
}

