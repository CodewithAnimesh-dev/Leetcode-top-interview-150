import java.util.*;

public class RansomNote {
    public static boolean isPossible(String ransomNote,String magazine){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<ransomNote.length();i++){
            char ch1=ransomNote.charAt(i);
            if(!map.containsKey(ch1)||map.get(ch1)==0) return false;
            map.put(ch1,map.get(ch1)-1);
        }
        return true;
    }
    public static void main(String[] args) {
        String ransomNote="aa",magazine="aab";
        boolean ans=isPossible(ransomNote, magazine);
        System.out.println(ans);
    }
}
