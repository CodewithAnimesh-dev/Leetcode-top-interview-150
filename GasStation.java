

public class GasStation {
    public static int complete(int[] gas,int[] cost){
        int totalgas=0,totalcost=0,start=0,currgas=0;
        for(int i=0;i<gas.length;i++){
            totalgas+=gas[i];
            totalcost+=cost[i];
            currgas+=gas[i]-cost[i];
            if(currgas<0){
                start=i+1;
                currgas=0;
            }
        }
        return (totalgas<totalcost) ? -1: start;
    }
    public static void main(String[] args) {
        int[] gas={1,2,3,4,5};
        int[] cost={3,4,5,1,2};
        int ans=complete(gas, cost);
        System.out.println(ans);
    }
}
