import java.util.ArrayList;

public class SpiralMatrix {
    public static ArrayList<Integer> spriralOrder(int[][] matrix){
        ArrayList<Integer> result=new ArrayList<>();
        if(matrix==null || matrix.length==0) return result;
        int startrow=0,startcol=0,endrow=matrix.length-1,endcol=matrix[0].length-1;
        while(startrow<=endrow && startcol<=endcol){
            for(int i=startcol;i<=endcol;i++){
                result.add(matrix[startrow][i]);
            }
            startrow++;
            for(int j=startrow;j<=endrow;j++){
                result.add(matrix[j][endcol]);
            }
            endcol--;
            if(startrow<=endrow){
                for(int i=endcol;i>=startcol;i--){
                    result.add(matrix[endrow][i]);
                }
            }
            endrow--;
            if(startcol<=endcol){
                for(int j=endrow;j>=startrow;j--){
                    result.add(matrix[j][startcol]);
                }
            }
            startcol++;
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<Integer> ans=spriralOrder(matrix);
        System.out.println(ans);
    }
}
