import java.util.function.*;
public class ConsumerInterfaceIntegerCode {
    public static void main(String[] args) {
        Consumer<Integer> sq = n -> {
        System.out.println(n * n);
      };
            sq.accept(5);
        
    }
}
