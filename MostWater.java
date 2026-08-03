public class MostWater {
    public static int mostwater(int[] heights){
        int lp=0,rp=heights.length-1,maxwater=0;
        while(lp<rp){
            int height=Math.min(heights[lp],heights[rp]);
            int width=rp-lp;
            int currwater=height*width;
            maxwater=Math.max(maxwater, currwater);
            if(heights[lp]<heights[rp]) lp++;
            else rp--;
        }
        return maxwater;
    }
    public static void main(String[] args) {
        int[] heights={1,8,6,2,5,4,8,3,7};
        int ans=mostwater(heights);
        System.out.println(ans);
    }
}
