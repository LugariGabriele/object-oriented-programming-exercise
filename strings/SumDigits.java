package strings;

//Given a string, return the sum of the digits 0-9 that appear in the string,
// ignoring all other characters. Return 0 if there are no digits in the string. (see Character class)
/*Examples:

sumDigits("aa1bc2d3") → 6
sumDigits("aa11b33") → 8
sumDigits("Chocolate") → 0
*/
public class SumDigits {
    public static int sumDigits(String string) {
        int sum = 0;

        for (char i = 0; i < string.length(); i++) { // ho messo char i perchè lo richiede digit
            if (Character.isDigit(i)) { // digit sono i numeri decimali
                sum = sum + Character.getNumericValue(i);
            }
        }
        return sum;
    }
}
