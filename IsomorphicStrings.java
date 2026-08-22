import java.util.*;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s,String t){
        HashMap<Character,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                if(!map.get(s.charAt(i)).equals(t.charAt(i))) return false;
            }else{
                if(map.containsValue(t.charAt(i))) return false;
                map.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s="egg",t="add";
        boolean ans=isIsomorphic(s, t);
        System.out.println(ans);
    }

}
