import java.util.*;

public class Sum3 {
    public static List<List<Integer>> threesum(int[] nums){
        if(nums==null || nums.length<3) return new ArrayList<>();
        Arrays.sort(nums);
        HashSet<List<Integer>> result=new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
            int lp=i+1,rp=nums.length-1;
            while(lp<rp){
                if(nums[i]+nums[lp]+nums[rp]==0){
                    result.add(Arrays.asList(nums[i],nums[lp],nums[rp]));
                    lp++;
                    rp--;
                }else if(nums[i]+nums[lp]+nums[rp]<0) lp++;
                else rp--;
            }
        }
        return new  ArrayList<>(result);
    }
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
        List<List<Integer>> result=threesum(nums);
        System.out.println(result);
    }
}
