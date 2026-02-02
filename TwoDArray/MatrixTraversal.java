package TwoDArray;

public class MatrixTraversal {
   public static void main(String[] args) {
     int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
     printArray(mat);
   }

   public static void printArray(int mat[][]){
    int m=mat.length;
    int n=mat[0].length;
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            System.out.print(mat[i][j]+" ");
        }
        System.out.println();
    }
   }
}
