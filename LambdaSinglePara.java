interface Square{
    int display(int n);
}
public class LambdaSinglePara{
    public static void main(String[] args) {
        Square obj = (n) -> n * n;  
        System.out.println("Multiplication: " + obj.display(5));
    } }  

