import java.util.HashMap;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        String[] words=s.split(" ");
        if(pattern.length()!=words.length) return false;
        for(int i=0;i<pattern.length();i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(words[i])) return false;
            }else{
                if(map.containsValue(words[i])) return false;
                map.put(pattern.charAt(i),words[i]);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String pattern="abba", s = "dog cat cat dog";
        boolean ans=wordPattern(pattern, s);
        System.out.println(ans);
    }
}
