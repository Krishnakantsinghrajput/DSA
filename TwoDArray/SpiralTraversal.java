package TwoDArray;

public class SpiralTraversal {
    public static void main(String[] args) {
        // int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
         int mat[][]={{1},{4},{7}};
         SpiralprintArray(mat);
    }
 public static void SpiralprintArray(int mat[][]){
     int StartRow=0;
     int StartCol=0;
     int EndRow=mat.length-1;
     int EndCol=mat[0].length-1;

     while(StartRow<=EndRow  && StartCol<=EndCol){
        //top
        for(int i=StartCol;i<=EndCol;i++){
            System.out.print(mat[StartRow][i]+" ");
        }
        //right part
        for(int j=StartRow+1;j<=EndRow;j++){
            System.out.print(mat[j][EndCol]+" ");
        }

        //bottom part
       if(StartRow<EndRow){
         for(int i=EndCol-1;i>=StartCol;i--){
            // if(StartRow==EndRow){
            //     break;
            // }
            System.out.print(mat[EndRow][i]+" ");
        }
       }

        //lefft
       if(StartCol<EndCol){
         for(int i=EndRow-1;i>=StartRow+1;i--){
            // if(StartCol==EndCol){
            //     break;
            // }
            System.out.print(mat[i][StartCol]+" ");
        }

       }
        StartRow++;
        StartCol++;
        EndCol--;
        EndRow--;
     }

}
}
