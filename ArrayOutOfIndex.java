public class ArrayOutOfIndex {
    public static void main(String[] args) {

        try {
            int[] arr = {10, 20, 30};

            System.out.println(arr[5]);  // Invalid index

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");

        } finally {
            System.out.println("Finally block always executes.");
        }
    }
} 
    

