public class NestedTryCatch {
    public static void main(String[] args){
        try{
            try{
                int x = 10 / 0;
            }
            catch(ArithmeticException e){
                System.out.println("Inner catch: Division by zero");
            }
            int[] a = {1,2};
            System.out.println(a[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Outer catch: Invalid array index");
        }
    }
    
}
