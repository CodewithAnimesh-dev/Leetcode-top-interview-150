import java.util.*;

public class LongestCommonPrefix {
    public static String longestprefix(String[] strs){
        Arrays.sort(strs);
        String str1=strs[0];
        String str2=strs[strs.length-1];
        int i=0;
        while(i<str1.length()){
            if(str1.charAt(i)==str2.charAt(i)) i++;
            else break;
        }
        return i==0?"":str1.substring(0, i);
    }
    public static void main(String[] args) {
        String[] strs={"flower","flow","flight"};
        String ans=longestprefix(strs);
        System.out.println(ans);
    }
}
