public class ExceptionHandling {
    public static void main(String[] args) {
        int [] arr = new int[5];
         
        try {

            

            System.out.println(arr[5]);
            int result = 10 / 0;
            System.out.println(result);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Array index is out of bounds: " + e.getMessage());
        }
        catch (ArithmeticException e) {

            System.out.println("Arithmetic error: " + e.getMessage());
        }
         finally {

            System.out.println("Finally block executed.");
        }
    }
    
}
