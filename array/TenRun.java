package array;

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
