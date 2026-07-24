public class LastWordLength {
    public static int lengthOfLastWord(String s) {
        int length=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) == ' '){
                break;
            }else{
                length++;
            }
        }
        return length;
    }
    public static void main(String[] args) {
        String s="luffy is still joyboy";
        int ans=lengthOfLastWord(s);
        System.out.println(ans);
    }
}
