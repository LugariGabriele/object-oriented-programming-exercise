package array;
/*
Given two int[] v1 and v2 of the same length, for every element in v1, 
consider the corresponding element in v2 (at the same index).
Return the count of the number of times that the two elements differ by 2 or less, but are not equal.
    */
public class MatchUp {
    public static int matchUp(int[] v1, int[] v2){
    int Count=0;
        for (int i = 0; i <v1.length ; i++) {
            if (v1[i]!=v2[i] && Math.abs(v1[i]-v2[i])<=2){
                Count++;}
        }
        return Count;
    }
}
