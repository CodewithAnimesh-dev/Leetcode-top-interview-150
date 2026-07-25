public class FirstOccurrenceofString {
    public static int firstOccurance(String haystack,String needle){
        return haystack.indexOf(needle);
    }
    public static void main(String[] args) {
        String haystack="sadbutsad",needle="sad";
        int ans=firstOccurance(haystack, needle);
        System.out.println(ans);
    }
}
