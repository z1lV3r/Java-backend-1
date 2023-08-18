public class Task {

    public static void main(String[] args) {
        int input = 0;
        System.out.println(new Task());
    }

    public boolean isArmstrongNumber(int input) {
        /* Add code here */
    }

    private int pow(int base, int exponent) {
        /* Add code here */
    }

    private int getNumberOfDigits(int input) {
        int numDigits = 0;
        if (input == 0) {
            numDigits = 1;
        } else {
            while (input != 0) {
                input /= 10;
                numDigits++;
            }
        }
        return numDigits;
    }

    private int getDigit(int input, int digitToGet) {
        int divisor = pow(10, digitToGet);
        return (input / divisor) % 10;
    }
}