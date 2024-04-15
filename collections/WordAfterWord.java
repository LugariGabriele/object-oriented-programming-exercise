package collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

/**
 * Download the Ulysses, by James Joyce book. Write a method, reading all the unique words of the book
 * (all words have to be converted in lowercase), and sorting them in alphabetical order. Given a word,
 * the method returns the next word (in alphabetical order) contained within the book (See TreeSet.tailSet()).
 */

    public class WordAfterWord {
        public static String wordAfterWord(String filename, String string) throws IOException {
            TreeSet<String> words = new TreeSet<>();
            for (String line : getLines(filename)) {
                words.addAll(lineToWords(line));
            }
            return words.tailSet(string, false).first();
        }

        public static List<String> getLines(String filename) throws IOException {
            return Files.readAllLines(Path.of(filename));
        }

        public static List<String> lineToWords(String line) {
            return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
        }
    }
