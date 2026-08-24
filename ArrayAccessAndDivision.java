public class ArrayAccessAndDivision {
    public static void main(String[] args){
        try{
            int[] a = {10, 20, 30};
            try{
                System.out.println(a[5]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Invalid Array Index");
            }
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
            System.out.println("Cant divide by zero");

        }
    }
    
}
