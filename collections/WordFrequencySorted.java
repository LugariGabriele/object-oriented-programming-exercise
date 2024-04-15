package collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

/**
 * Add two methods to WordFrequency.java for returning a new Map<String, Integer> containing only the n most (or less)
 * frequent words and their frequency. Entries within the returned Map, have to be sorted by value (i.e. frequency).
 * For sorting, you can transform the Map<String, Integer> into a List<Map.Entry<String, Integer>>
 * which can be sorted using a Comparator<Map.Entry<String, Integer>>. Remember also that LinkedHashMap is an implementation of Map
 * maintaining the insertion order.
 */
public class WordFrequencySorted {
    public static Map<String, Integer> sortAndCut(Map<String, Integer> map, Comparator<Map.Entry<String, Integer>> comparator, int limit) {
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet()); // create a list of the value in Set method of map
        entries.sort(comparator); // sort in base of the comparator
        entries = new ArrayList<>(entries.subList(0, limit)); // change entries in an arraylist big as the limit

        Map<String, Integer> dst = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> i : entries) {
            dst.put(i.getKey(), i.getValue());
        }
        return dst;
    }

    public static Map<String, Integer> mostFrequent(Map<String, Integer> map, int limit) {
        /**
         * in the comparator we create 2 map object and if the compare to is:
         * =0 the istance e2 is in the same position of e1 in the sorting
         * <0 e2 is smaller of e1
         * >0 e2 is bigger of e1
         *
         * doing e2-e1 I'm doing a compare from the last to the first
         */
      return sortAndCut(map, (e1, e2) -> e2.getValue() - e1.getValue(), limit);
    }

    /**
     * same as before but by chaging the compraor in from less frequent to most it change the sorting
     *
     */
    public static Map<String, Integer> lessFrequent(Map<String, Integer> map, int limit) {
        return sortAndCut(map, (e1, e2) -> e1.getValue() - e2.getValue(), limit);

    }

    public static Map<String, Integer> wordFrequency(String filename) throws IOException {
        Map<String, Integer> frequency = new HashMap<>();

        for (String lines : getLines(filename)) { //lines
            for (String words : lineToWords(lines)) { // words in lines

                if (frequency.containsKey(words)) { // add 1 at the value of the word
                    frequency.put(words, frequency.get(words) + 1);
                } else { // initialize new words
                    frequency.put(words, 1);
                }
            }
        }
        return frequency;
    }

    /**
     * For reading the file and transforming it into a List<String>
     */
    public static List<String> getLines(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));
    }

    /**
     * For splitting a line into a list of single words
     */
    public static List<String> lineToWords(String line) {
        return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
    }
}
