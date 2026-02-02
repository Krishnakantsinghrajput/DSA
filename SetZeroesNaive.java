import java.util.*;
class SetZeroesNaive{
    public static void main(String args[]){
        int matrix[][]={{1,1,1},{1,0,1},{1,1,1}};
         int m=matrix.length;
        int n=matrix[0].length;
      int result[][] = Set_Zeroes(matrix,m,n);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    } 

    public  static  int [][] Set_Zeroes(int matrix[][],int m,int n){
        ArrayList<int[]> positions=new ArrayList<>();
       

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    positions.add(new int[]{i,j});
                }
            }
        }

        for(int pos[]:positions){
            int x=pos[0];
            int y=pos[1];

            for(int i=0;i<n;i++){
                matrix[x][i]=0;
            }
            for(int i=0;i<m;i++){
                matrix[i][y]=0;
            }
        }
        return matrix;
    }
}