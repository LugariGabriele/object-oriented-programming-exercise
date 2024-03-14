package strings;

import java.util.Scanner;

public class CountYZ {
//Write a method accepting a string, and counting the number
// of words ending in 'y' or 'z' so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y'
// in "yellow" (not case sensitive)
    public static int countYZ(String string){
int count =0;
        Scanner scanner = new Scanner(string); // scannerizza la string
        while(scanner.hasNext()) { // da true se scanner ha un altro carattere davanti in questo caso
        String token = scanner.next().toLowerCase(); // prende il carattere sucessivo dello scanner e lo rende minuscolo
            char lastchar = token.charAt(token.length()-1);
            if (lastchar=='y'||lastchar=='z'){
count++;
            }


        }
        return count;
    }
}
