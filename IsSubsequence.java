public class IsSubsequence {
    public static boolean ismatch(String s,String t){
        if(s.length()==0) return true;
        int lp=0,rp=0;
        while(lp<s.length() && rp<t.length()){
            if(s.charAt(lp)==t.charAt(rp)){
                lp++;
                rp++;
            }else rp++;
        }
        if(lp==s.length()) return true;
        else return false;
    }
    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        boolean ans=ismatch(s, t);
        System.out.println(ans);
    }
}
