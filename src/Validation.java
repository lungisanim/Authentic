/**
 * Created by lungisani on 2017/02/25.
 */
public class Validation {
    public static String getGender(int gender) {
        if (gender < 5000)
            return "Female";
        else
            return "Male";
    }

    public static String getCitizenship(int citizen) {
        if (citizen == 0)
            return "South African born";
        else
            return "Permanent citizen";
    }
}
