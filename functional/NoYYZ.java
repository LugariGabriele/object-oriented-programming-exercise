package functional;

import java.util.List;
import java.util.stream.Collectors;

/**
 Given a list of strings, return a list where each string has "y" added at its end,
 omitting any resulting strings that contain "yy" as a substring anywhere.
 Nevertheless, each string starting with "z" has to printed to standard output. (see Stream.peek())

 Examples:

 noYYZ(["a", "b", "c"]) → ["ay", "by", "cy"]
 noYYZ(["a", "b", "cy"]) → ["ay", "by"]
 noYYZ(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"] (prints "zzy")
 The method has the following prototype:

 public static List<String> noYYZ(List<String> strings);
 */
public class NoYYZ {
    public static List<String> noYYZ(List<String> strings){

        return strings.stream()
                .map(s->s+"y").
                filter(s->!s.contains("yy"))
                .peek(s->{
                    if (s.startsWith("z")){
                        System.out.println(s);
                    }
                })
                .collect(Collectors.toList());
    }

}
