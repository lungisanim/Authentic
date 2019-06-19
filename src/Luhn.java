import java.math.BigInteger;

/**
 * Created by lungisani on 2017/02/25.
 */
class Luhn {
    public static Boolean IsIdentificationValid(BigInteger identities){
        char[] identify = identities.toString().toCharArray();
        int summation = 0;
        for(int x = 0; x < identify.length - 1; x++){
            int numbers = Character.getNumericValue(identify[x]);
            if((x % 2) != 0){
                summation += numbers < 5 ? numbers * 2 : numbers * 2 - 9;
            }else{
                summation += numbers;
            }

        }
        int checksum = Character.getNumericValue(identify[identify.length - 1]);
        int algorithm = (summation * 9) % 10;

        return (algorithm == checksum);
    }
}
