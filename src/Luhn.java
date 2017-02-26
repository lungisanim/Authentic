import java.math.BigInteger;
import java.util.Arrays;

import static java.lang.String.*;

/**
 * Created by lungisani on 2017/02/25.
 */
public class Luhn {
    public static int getIdentitySummation(BigInteger identities){
        BigInteger[] identity = {identities};
        int sumOdd = 0;
        int sumEven = 0;
        int summation = sumOdd + sumEven;
        String idString = Arrays.toString(identity);
        char[] chars = idString.toCharArray();
        int size = chars.length;
        for(int x = 0; x < size - 1; x++){
            String stringInt = valueOf(chars);
            int integers = Integer.valueOf(stringInt);
            if(chars[x]%2 == 0){
                sumOdd += integers;
            }else if(chars[x]%2 != 0){
                for(char ideally : chars){
                    String stringNum = valueOf(ideally);
                    int intNumbers = Integer.valueOf(stringNum);
                    int newNumber = intNumbers * 2;
                    if(newNumber > 9){
                        String string1 = valueOf(newNumber);
                        char[] chars1 = string1.toCharArray();
                        for(char charInt : chars1){
                            String chasing = valueOf(charInt);
                            int integer = Integer.valueOf(chasing);
                            sumEven += integer;
                        }
                    }
                }
            }
        }
        return summation;
    }

    public static int getSummation(int numbr) {
        int[] number = {numbr};
        int sum = 0;
        for (int ar : number) {
            int newNumber = ar * 2;
            System.out.println(newNumber);
            if (newNumber > 9) {
                String divide = valueOf(newNumber);
                char[] chars = divide.toCharArray();
                for (char charInt : chars) {
                    String numbers = valueOf(charInt);
                    int numberInt = Integer.valueOf(numbers);
                    sum += numberInt;
                }
            }
        }
        return sum;
    }
}
