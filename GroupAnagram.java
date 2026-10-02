import java.util.*;

public class GroupAnagram {
    public static List<List<String>> group(String[] strs){
        if(strs==null || strs.length==0) return new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String str=strs[i];
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String sortedstr=new String(ch);
            if(!map.containsKey(sortedstr)) map.put(sortedstr,new ArrayList<>());
            map.get(sortedstr).add(str);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String[] strs={"eat","tea","tan","ate","nat","bat"};
        List<List<String>> list= group(strs);
        System.out.println(list);
    }
}
