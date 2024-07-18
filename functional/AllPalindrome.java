package functional;

import java.util.List;

/**
 * Given a list of strings, return true if all strings are palindrome.
 *
 * Examples:
 *
 * allPalindrome(["kayak", "deed", "noon"]) → true
 * allPalindrome(["kayak", "hello"]) → false
 * allPalindrome(["hello", "world"]) → false
 * The method has the following prototype:
 *
 */
public class AllPalindrome {
    public static boolean allPalindrome(List<String> strings){
        return strings.stream().allMatch(AllPalindrome::isPalindorme);
    }
    public static boolean isPalindorme(String s){
        return new StringBuilder(s).reverse().toString().equals(s);
    }
}
