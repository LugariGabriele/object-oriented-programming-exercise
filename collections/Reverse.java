package collections;

import java.util.*;

/**
 * Write a method reversing the order of words in a sentence (represented as a List<String>) using an ArrayDeque as a stack
 * (see .addLast() and .pollLast() methods). Each word has to be pushed to the stack and fetched later. If the stack is behaving correctly,
 * the order is reversed.
 * Examples:
 * reverse(["Hello", "World!"]) → ["World!", "Hello"]
 * reverse(["I", "am"]) → ["am", "I"]
 */
public class Reverse {
    public static List<String> reverse(List<String> sentence){
        Deque<String> stack= new ArrayDeque<>(sentence);
        List<String> dst=new ArrayList<>();
        while (!stack.isEmpty()){
            dst.add(stack.getLast());
            stack.removeLast();
           // System.out.println(dst);
        }
        return dst;


    }



}


