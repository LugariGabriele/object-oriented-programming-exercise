package functional;

import java.util.List;
import java.util.Map;

/**
 * Write two static generic methods receiving, respectively, a generic List and a generic Map and printing
 * to standard output their content following the template below. Both methods must be 1 line long (see List.forEach(), Map.forEach()).
 *
 * Examples:
 *
 * justPrintList(["Marco", "Matteo", "Luca", "Giovanni"]) → void
 *
 * Hello Marco!
 * Hello Matteo!
 * Hello Luca!
 * Hello Giovanni!
 *
 * justPrintMap(1: "nicola", 2: "agata", 3: "darma", 4: "marzia") → void
 * Prints:
 *
 * k:4, v:marzia
 * k:3, v:darma
 * k:2, v:agata
 * k:1, v:nicola
 */
public class JustPrint {

    public static <T> void justPrintList(List<T> list){
        list.forEach(l-> System.out.println("Hello "+l+"!"));
    }
    public static <K,V> void justPrintMap(Map<K, V> map){
        map.forEach(((k, v) -> System.out.println("k:"+k+", v:"+v)));
    }
}
