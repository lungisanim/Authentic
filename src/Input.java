import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by lungisani on 2017/02/25.
 */
class Input {
    static BigInteger getInteger(){
        Scanner in = new Scanner(System.in);
        try{
            return in.nextBigInteger();
        }catch (Exception exc){
            return BigInteger.valueOf(-1);
        }
    }
    static String getString(){
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
