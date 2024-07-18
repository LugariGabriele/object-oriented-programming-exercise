package functional;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

/**
 * Download the Ulysses, by James Joyce book.
 * Write two methods, reading all the lines of the file and returning respectively:
 * (a) how many lines contain a specific substring, (b) how many times a specific word appears in an isolated form (not as a substring).
 *
 * The methods have the following prototype:
 *
 * public static long howManyLines(String filename, String subString);
 * public static long howManyTimes(String filename, String word);
 */
public class Words {
    public static long howManyLines(String filename, String subString) throws IOException {
        return getLines(filename).stream().filter(s->s.contains(subString)).count();
    }
    public static long howManyTimes(String filename, String word){
        return lineToWords(filename).stream().flatMap(line->Arrays.stream(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"))).filter(w -> w.equals(word)).count();
    }
    public static List<String> getLines(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));
    }
    public static List<String> lineToWords(String line) {
        return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
    }
}
