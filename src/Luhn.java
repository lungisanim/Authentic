import java.math.BigInteger;
import java.util.Arrays;

/**
 * Created by lungisani on 2017/02/25.
 */
public class Luhn {
    public static int getIdentitySummation(BigInteger identities){
        BigInteger[] identity = {identities};
        int sumOdd = 0;
        int sumEven = 0;
        int summation = sumOdd + sumEven;
        String identityString = Arrays.toString(identity);


        return summation;
    }

}
