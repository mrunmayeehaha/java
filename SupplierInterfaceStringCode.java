import java.util.function.*;
public class SupplierInterfaceStringCode {
    public static void main(String[] args) {
        Supplier<String> s = () -> "JAVA";
        System.out.println(s.get());
    }
}
