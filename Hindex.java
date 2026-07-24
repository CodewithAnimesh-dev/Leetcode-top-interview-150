import java.util.*;

public class Hindex {
    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        for(int i=0;i<citations.length;i++){
            int h=citations.length-i;
            if(citations[i]>=h) return h;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] cititions={3,0,6,1,5};
        int ans= hIndex(cititions);
        System.out.println(ans);
    }
}
