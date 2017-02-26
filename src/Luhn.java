/**
 * Created by lungisani on 2017/02/25.
 */
public class Luhn {
    public static int getSummation(int numbr) {
        int[] number = {numbr};
        int sum = 0;
        for (int ar : number) {
            int newNumber = ar * 2;
            System.out.println(newNumber);
            if (newNumber > 9) {
                String divide = String.valueOf(newNumber);
                char[] chars = divide.toCharArray();
                for (char charInt : chars) {
                    String numbers = String.valueOf(charInt);
                    int numberInt = Integer.valueOf(numbers);
                    sum += numberInt;
                }
            }
        }
        return sum;
    }
}
