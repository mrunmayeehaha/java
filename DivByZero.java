class DivByZero{
    public static void main(String[] args){
        try {
            int a = 10;
            int b = 0;
            int ans = a / b;
            System.out.println(ans);
            } catch (ArithmeticException e){
            System.out.println("Division by zero");
        }
        }

    }
