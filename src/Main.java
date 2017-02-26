import java.math.BigInteger;

/**
 * Created by lungisani on 2017/02/25.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter an identity number to validate: ");
        BigInteger ID_No = Input.getInteger();

        String identity = String.valueOf(ID_No);
        String male = null, female = null;
        int gender = Integer.valueOf(identity.substring(6, 10));
        int citizen = Integer.valueOf(identity.substring(10, 11));

        StringBuilder buffer = new StringBuilder(identity);
        char[] person = identity.toCharArray();

        Validation validate = new Validation();
        Invalid invalidate = new Invalid();
        Luhn luhn = new Luhn();

        int length = person.length;
        // TODO: 2017/02/26 : Check why the catch seemingly isn't working
        {
            if (length == 13) {
                //invalidate.invalid(citizen);
                //System.out.println(validate.getGender(gender));
                //System.out.println(validate.getCitizenship(citizen));
                //System.out.println();
                System.out.println(luhn.getIdentitySummation(ID_No));

            }


        }
    }
}
