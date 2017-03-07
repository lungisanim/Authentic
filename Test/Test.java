import java.math.BigInteger;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger identities = in.nextBigInteger();
        char[] identify = identities.toString().toCharArray();
        int summation = 0, sumEven = 0, sumOdd = 0;
        for (int x = 0; x < identify.length - 1; x++) {
            int numbers = Character.getNumericValue(identify[x]);
            if ((x % 2) != 0) {
                sumOdd += numbers < 5 ? numbers * 2 : numbers * 2 - 9;
            } else {
                sumEven += numbers;
            }

        }
        summation = sumEven + sumOdd;
        int checksum = Character.getNumericValue(identify[identify.length - 1]);
        int algorithm = (summation * 9) % 10;

        System.out.println(summation);
    }
}