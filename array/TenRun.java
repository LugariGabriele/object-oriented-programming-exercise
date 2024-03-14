package array;
/*
For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, 
until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.
*/
public class TenRun {
    public static int[] tenRun(int[] v){
    int [] dst= new int[v.length];
    boolean found10=false;
    int found=0;
        for (int i = 0; i <v.length ; i++) {
        if(v[i]%10 ==0){
          found10=true;
          found=v[i];
        }
        dst[i]=found10? found: v[i]; //? serve per bool se vero fa prima espressione sennò fa quella dopo :


       }


        return dst;
    }

}
