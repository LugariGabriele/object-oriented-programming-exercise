package collections;

import java.util.Map;

/**
 * Roman numerals are represented by seven different symbols:
 * <p>
 * I = 1
 * V = 5
 * X = 10
 * L = 50
 * C = 100
 * D = 500
 * M = 1000
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII.
 * Instead, the number four is written as IV. Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX.
 * <p>
 * There are six instances where subtraction is used:
 * <p>
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to a decimal one.
 * <p>
 * Examples:
 * <p>
 * romanToDecimal("III") -> 3
 * romanToDecimal("LVIII") -> 58
 * romanToDecimal("MCMXCIV") -> 1994
 */
public class RomanToDecimal {
    private static Map<Character, Integer> Conversion() {
        return Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );
    }

    public static int romanToDecimal(String s) {
        Map<Character, Integer> conversion = Conversion(); // recall the map created before
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i < s.length() - 1) && conversion.get(s.charAt(i)) < conversion.get(s.charAt(i + 1))) //control for number before 5 multiples
            {
                result = result - conversion.get(s.charAt(i));

            } else {
                result = result + conversion.get(s.charAt(i));
            }
            System.out.println(result);
        }
        return result;
    }


}
