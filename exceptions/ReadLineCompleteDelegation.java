package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Write a method for reading the first line of a given file (see java.io.BufferedReader class). In case of errors (IOException),
 * the method applies a complete delegation model.
 * Use the syntax try-with-resources for guaranteeing the proper closing of the file under any circumstance.
 * The method has the following prototype:
 *
 * public static String readLineCompleteDelegation(String filename) throws IOException;
 */
public class ReadLineCompleteDelegation {
    public static String readLineCompleteDelegation(String filename) throws IOException {
        try(BufferedReader bufferedReader= new BufferedReader(new FileReader(filename))){
            return bufferedReader.readLine();
        }
    }
}
