import java.util.Arrays;

public class peakElement2 {
    public static void main(String args[]){
       int mat[][] =  {{10,20,15},{21,30,14},{7,16,32}};
       int peak[]=FindPeak2(mat);
       System.out.println(Arrays.toString(peak));

    }

    public static int[] FindPeak2(int mat[][]){
        int rows=mat.length;
        int cols=mat[0].length-1;
        int low=0;
        int high=cols-1;
        while(low<=high){
            int midcol=low+(high-low)/2;
            int rowmax=0;
            for(int i=0;i<rows;i++){
                if(mat[i][midcol]>mat[rowmax][midcol]){
                    rowmax=i;
                }
            }

            boolean IsLeftBigger=(midcol-1>=0) &&(mat[rowmax][midcol-1]>mat[rowmax][midcol]);
            boolean IsRightBigger=(midcol+1<cols) &&(mat[rowmax][midcol+1]>mat[rowmax][midcol]);

            if(!IsLeftBigger && !IsRightBigger){
                return  new int[]{rowmax,midcol};

            }
            else if(IsLeftBigger){
                high=midcol-1;
            }
            else{
                low=midcol+1;
            }
        }
        return new int[]{-1,-1};
    }
}
