interface multipleparmeter{
    int display(int a, int b);
}

public class LambdaMultiplePara{
    public static void main(String[] args) {
        multipleparmeter obj = (a,b) -> a + b;
        System.out.println("Addition: " + obj.display(4,5));        
    }}

