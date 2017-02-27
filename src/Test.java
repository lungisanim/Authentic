import java.util.Scanner;

/**
 * Created by lungisani on 2017/02/27.
 */
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String identify = String.valueOf(in.next());
        int length = identify.length() - 1;
        String identity = identify.substring(0, length);
        String check = identify.substring(12, 13);
        int checksum = Integer.valueOf(check);
        char[] chars = identity.toCharArray();
        int size = chars.length;
        int sumOdd = 0, sumEven = 0, sumDoubled = 0, doubledSum = 0;
        int sum = 0, x = 0;
        while (x < size) {
            if (x % 2 == 0) {
                String numString = String.valueOf(chars[x]);
                int numbers = Integer.valueOf(numString);
                sumOdd += numbers;
            } else if (x % 2 != 0) {
                String numString = String.valueOf(chars[x]);
                int numbers = Integer.valueOf(numString);
                int doubled = numbers * 2;
                if (doubled > 9) {
                    String doubledString = String.valueOf(doubled);
                    char[] doubledChar = doubledString.toCharArray();
                    for (char array : doubledChar) {
                        String stringer = String.valueOf(array);
                        int stringerInt = Integer.valueOf(stringer);
                        sumDoubled += stringerInt;
                    }
                }
                doubledSum = doubled + sumDoubled;
            }
            x++;
        }
        doubledSum = doubledSum - 4;
        int summation = sumOdd + doubledSum;
        int sums = summation * 9;
        if (sums % 10 == checksum) {
            System.out.println("Valid Identity number.");
        } else {
            System.out.println("Invalid Identity number.");
        }
    }
}
