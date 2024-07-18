package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Write a method for reading the first line of a given file (see java.io.BufferedReader class).
 * In case of errors (IOException), the method applies a partial delegation model
 * throwing an unchecked exception (RunTimeException) instead of IOException. The method has the following prototype:
 * <p>
 * public static String readLinePartialDelegation(String filename);
 */
public class ReadLinePartialDelegation {
    public static String readLinePartialDelegation(String filename) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            return bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
