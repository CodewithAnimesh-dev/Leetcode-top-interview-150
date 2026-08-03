import java.util.Arrays;

public class TwoSum2 {
    public static int[] twosum(int[] nums,int target){
        int lp=0,rp=nums.length-1;
        while(lp<rp){
            if(nums[lp]+nums[rp]==target) return new int[]{lp+1,rp+1};
            else if(nums[lp]+nums[rp]<target) lp++;
            else rp--;
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        int []ans=twosum(nums, target);
        System.out.println(Arrays.toString(ans));
    }
}
