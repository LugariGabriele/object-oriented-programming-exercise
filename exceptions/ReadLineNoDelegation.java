package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Write a method reading the first line of a given file (see java.io.BufferedReader class).
 * In case of errors (IOException), the method applies a no-delegation model and returns null.
 * The method has the following prototype:
 * <p>
 * public static String readLineNoDelegation(String filename);
 */
public class ReadLineNoDelegation {
    public static String readLineNoDelegation(String filename) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            return bufferedReader.readLine();
        } catch (IOException e) {
            return null;
        }
    }
}
