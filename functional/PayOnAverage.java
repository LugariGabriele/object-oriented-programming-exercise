package functional;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * A large telecom operator keeps track of the monthly subscription
 * fees associated with each phone number using a Map as the one showed below:
 * <p>
 * Map<String, Double> fees = {
 * "34745..." : 11.75,
 * "33367..." : 9.75,
 * "34833..." : 7.75,
 * "33188..." : 7.75,
 * "33112..." : 7.95,
 * ...
 * }
 * Write a method returning a Map<String, Double> having as keys the families of numbers (e.g., "347", "333", "348", etc.)
 * and as values the average subscription fee for that family (see this guide, and Collectors.groupingBy()).
 * <p>
 * Examples:
 * <p>
 * payOnAverage(fees) -> {"347" : 11.75, "333" : 9.75, "348" : 7.75, "331" : 7.85}
 * The method has the following prototype:
 * <p>
 * public static Map<String, Double> payOnAverage(Map<String, Double> fees);
 */
public class PayOnAverage {
    public static Map<String, Double> payOnAverage(Map<String, Double> fees) {
        return fees.entrySet().stream().collect(Collectors.groupingBy(entry ->
                entry.toString().substring(0, 3),
                Collectors.averagingDouble(Map.Entry::getValue)));
    }
}
