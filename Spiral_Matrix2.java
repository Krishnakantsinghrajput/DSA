public class Spiral_Matrix2 {
    public static void main(String args[]){
        int n=3;
        int result[][]=GenerateMatrix(n);
     for(int i=0;i<result.length;i++){
        for(int j=0;j<result.length;j++){
            System.out.print(result[i][j]+" ");
        }
        System.out.println();
     }
    }

    public static int[][] GenerateMatrix(int n){
        int matrix[][]=new int[n][n];
        int left=0,right=n-1;
        int top=0,bottom=n-1;
int num=1,max=n*n;
while(num<=max){
    for(int i=left;i<=right && num<=max;i++){
        matrix[top][i]=num++;
    }
    top++;

    for(int i=top;i<=bottom &&num<=max;i++){
        matrix[i][right]=num++;
    }
    right--;

    for(int i=right;i>=left && num<=max;i--){
        matrix[bottom][i]=num++;

    }
    bottom--;
    for(int i=bottom;i>=top && num<=max;i--){
        matrix[i][left]=num++;
    }
    left++;
}
return matrix;
    }
}
