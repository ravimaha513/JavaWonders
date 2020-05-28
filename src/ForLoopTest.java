public class ForLoopTest {
    public static void main(String[] args) {

        int largeSum = 334567;


        String s = String.valueOf(largeSum);
        int length = s.length();
        int lastDigit = largeSum%10;

        double divisor = Math.pow(10, length-1);

        int firstDigit = (int) largeSum/(int) divisor;

        System.out.println(lastDigit+firstDigit);


    }
}
