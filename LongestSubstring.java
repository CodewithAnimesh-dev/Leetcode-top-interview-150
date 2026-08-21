import java.util.*;

public class LongestSubstring {
    public static int lengthofstring(String s){
        HashSet<Character> set=new HashSet<>();
        int lp=0,maxLength=0;
        for(int rp=0;rp<s.length();rp++){
            while(set.contains(s.charAt(rp))){
                set.remove(s.charAt(lp));
                lp++;
            }
            set.add(s.charAt(rp));
            int currlength=rp-lp+1;
            maxLength=Math.max(maxLength, currlength);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s="pwwkew";
        int ans=lengthofstring(s);
        System.out.println(ans);
    }
}
