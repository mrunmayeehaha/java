interface Calculator{
    int calc(int a, int b);
}
public class LambdaCalculator{
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;
        Calculator multiply = (a, b) -> a * b;
        Calculator divide = (a, b) -> {
            if (b == 0) {
                System.out.println("Error: Division by zero!");
                return 0;
            }
            return a / b;
        };

        System.out.println("Addition: " + add.calc(5, 7));
        System.out.println("Subtraction: " + subtract.calc(2, 9));
        System.out.println("Multiplication: " + multiply.calc(1, 4));
        System.out.println("Division: " + divide.calc(6, 7));

    }}


        

