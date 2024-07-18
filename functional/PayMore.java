package functional;

import java.util.Map;

/**
 * A large telecom operator keeps track of the monthly subscription fees associated with each phone number using a Map as the one showed below:
 *
 * Map<String, Double> fees = {
 *     "34745..." : 11.75,
 *     "33367..." : 9.75,
 *     "34833..." : 7.75,
 *     "33188..." : 7.75,
 *     "33112..." : 7.95,
 *     ...
 * }
 * Write a (one-line!) method for adding (or removing) a price delta to all numbers of a certain family (see Map.replaceAll()).
 *
 * Examples:
 *
 * payMore(fees, "333", +0.5) -> adds 50 cents of monthly fee to all "333" numbers.
 * payMore(fees, "347", -1.0) -> removes 1 euro of monthly fee to all "347" numbers.
 */
public class PayMore {
    public static void payMore(Map<String, Double> fees, String numberFamily, double costDelta){
        fees.replaceAll((num,price)->num.startsWith(numberFamily)? price+costDelta:price+0 );
    }
}
