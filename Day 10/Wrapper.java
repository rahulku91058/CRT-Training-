public class Wrapper {
    public static void main(String[] args) {
        Integer a = 12;
        Integer b = 13;
        // Integer b = Integer.valueOf(13);
        // System.out.println(Integer.bitCount(15));

        Integer c = a + b; // Autoboxing
        System.out.println("Sum: " + c);

        int num = 15;
        int count = Integer.bitCount(num);
        System.out.println("Set bits in " + num + ": " + count);
        System.out.println("binary representation: " + Integer.toBinaryString(num));
    }    
}
