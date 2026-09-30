import java.util.function.*;
public class SupplierInterfaceIntegerCode {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> 100;
        System.out.println(s.get());

    }
}
