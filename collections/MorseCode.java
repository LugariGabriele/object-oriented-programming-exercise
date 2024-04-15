package collections;

import java.util.HashMap;
import java.util.Set;

/**
 * Write a static method accepting a String, converting it to lowercase, and returning its Morse translation.
 * The 26 lowercase letters of the english alphabet have to be supported.
 * <p>
 * You have to use a Map<Characher, String> as a conversion table (dot='.', dash='_').
 * If the input String contains characters not supported by the conversion table, IllegalArgumentException have to be thrown.
 * <p>
 * Examples:
 * <p>
 * morseCode("hello") -> .... . ._.. ._.. ___
 * morseCode("world") -> .__ ___ ._. ._.. _..
 * morseCode("w0rld") -> IllegalArgumentException
 */
public class MorseCode {
    public static HashMap<Character, String> conversionMap() {
        HashMap<Character, String> conversionMap = new HashMap<>();
        conversionMap.put('a', "._");
        conversionMap.put('b', "_...");
        conversionMap.put('c', "_._.");
        conversionMap.put('d', "_..");
        conversionMap.put('e', ".");
        conversionMap.put('f', ".._.");
        conversionMap.put('g', "__.");
        conversionMap.put('h', "....");
        conversionMap.put('i', "..");
        conversionMap.put('j', ".___");
        conversionMap.put('k', "_._");
        conversionMap.put('l', "._..");
        conversionMap.put('m', "__");
        conversionMap.put('n', "_.");
        conversionMap.put('o', "___");
        conversionMap.put('p', ".__.");
        conversionMap.put('q', "__._");
        conversionMap.put('r', "._.");
        conversionMap.put('s', "...");
        conversionMap.put('t', "_");
        conversionMap.put('u', ".._");
        conversionMap.put('v', "..._");
        conversionMap.put('w', ".__");
        conversionMap.put('x', "_.._");
        conversionMap.put('y', "_.__");
        conversionMap.put('z', "__..");
        return conversionMap;

    }

    /**
     * check if in a string a iilegal char is contained
     * @param allowedChars
     * @param string
     */
    public static void checkString(Set<Character> allowedChars, String string) {
        for (char c : string.toLowerCase().toCharArray()) {
            if (!allowedChars.contains(c)) {
                throw new IllegalArgumentException("string contains character not supported");
            }
        }
    }

    public static String morseCode(String string) {
    HashMap<Character,String> conversionMap = conversionMap();
    checkString(conversionMap.keySet(),string);
    StringBuilder sb = new StringBuilder();
        for (char c: string.toLowerCase().toCharArray()) {
            sb.append(conversionMap.get(c)).append(" ");
        }
        return  sb.toString().trim(); // trim remove the  space after the last word
    }

}
