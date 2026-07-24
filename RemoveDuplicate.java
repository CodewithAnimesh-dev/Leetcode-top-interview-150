public class RemoveDuplicate {
    public static int remove(int[] nums){
        int index=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[index-1]) nums[index++]=nums[i];
        }
        return index;
    }
    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        int ans=remove(nums);
        System.out.println(ans);
    }
}
