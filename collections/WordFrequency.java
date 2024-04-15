package collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Download the Ulysses, by James Joyce book. Write a method, reading all the lines of the file and returning a Map<String, Integer>
 * having all the unique words of the book as keys, associated with the number of times they appeared.
 */
public class WordFrequency {
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
