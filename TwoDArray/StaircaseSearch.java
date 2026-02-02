package TwoDArray;

public class StaircaseSearch {
    public static void main(String[] args) {
          int mat[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key=50;

        boolean res=SearchFun(mat, key);
        System.out.println(res);
    }

    public static boolean SearchFun(int mat[][],int key){
        // int row=0,col=mat[0].length-1;
        // while(row<mat.length && col>=0){
        //     if(mat[row][col]==key){
        //         return true;
        //     }
        //     else if(key<mat[row][col]){
        //         col--;
        //     }
        //     else {
        //         row++;
        //     }
        // }
        // return false;
        int row=mat.length-1;
        int col=0;
        while (row>=0 && col<=mat[0].length-1 ) {
            if(mat[row][col]==key){
                return true;
            }
            else if(mat[row][col]<key){
                col++;
            }
            else{
                row--;
            }
            
        }
        return false;
    }
}
