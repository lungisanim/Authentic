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

        StringBuffer buffer = new StringBuffer(identity);
        char[] person = identity.toCharArray();

        Validation validate = new Validation();
        Invalid invalidate = new Invalid();

        int length = person.length;
        // TODO: 2017/02/26 : Check why the catch seemingly isn't working
        try {
            if (length == 13) {
                invalidate.invalid(citizen);
                System.out.println(validate.getGender(gender));
                System.out.println(validate.getCitizenship(citizen));
            }
        } catch (Exception exc) {
            System.out.println("Invalid Identity number");
        } finally {
            System.out.println("Please try again: ");
        }
    }
}
