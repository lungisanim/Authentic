import java.math.BigInteger;

/**
 * Created by lungisani on 2017/02/25.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter an identity number to validate: ");
        BigInteger ID_No = Input.getInteger();
        String identify = String.valueOf(ID_No);
        String genderSt = identify.substring(6, 10);
        int gender = Integer.valueOf(genderSt);
        String citiSt = identify.substring(10, 11);
        int citizen = Integer.valueOf(citiSt);
        String contStr = identify.substring(11,12);
        int control = Integer.valueOf(contStr);

        if(Luhn.isIdentificationValid(ID_No) && (control == 8 || control == 9)){
            System.out.println("Valid Identification Number: ");
            System.out.println(Validation.getGender(gender));
            System.out.println(Validation.getCitizenship(citizen));
        }else {
            System.out.println("Invalid Identification Number");
            //Invalid.invalid(0);
        }


    }
}
