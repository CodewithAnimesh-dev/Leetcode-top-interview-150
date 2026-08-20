public class MinimumSize {
    public static int minsize(int[] nums,int target){
        int length=Integer.MAX_VALUE;
        int low=0,currsum=0;
        for(int high=0;high<nums.length;high++){
            currsum+=nums[high];
            while(currsum>=target){
                int currwindow=high-low+1;
                length=Math.min(currwindow,length);
                currsum-=nums[low];
                low++;
            }
        }
        return length==Integer.MAX_VALUE?0:length;
    }
    public static void main(String[] args) {
        int[] nums={2,3,1,2,4,3};
        int target=7;
        int ans=minsize(nums, target);
        System.out.println(ans);
    }
}
