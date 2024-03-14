package strings;

public class Concatenate {
    public static String concatenate(String[] strings) {
        StringBuilder sb = new StringBuilder();
        //The principal operations on a StringBuilder are the append and insert methods, which are overloaded so as to
        // accept data of any type. Each effectively converts a given datum to a string and then appends or inserts the
        // characters of that string to the string builder.
        for (String string : strings) {
            sb.append(string);
        }
        //if z refers to a string builder object whose current contents are "start",
        // then the method call z.append("le") would cause the string builder to contain "startle"
        return sb.toString();
    }
}

