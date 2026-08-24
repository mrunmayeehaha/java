public class NumberFormatExceptionProgram {
    static void convert(String s){
        try{
            int n = Integer.parseInt(s);
            System.out.println("Number: " + n);
        }
        catch(NumberFormatException e){
            System.out.println("Invalid Number");
        }
    }
    public static void main(String[] args){
        convert("123");
        convert("abc");

    }
}
