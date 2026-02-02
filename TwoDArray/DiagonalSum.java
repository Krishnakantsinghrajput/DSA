package TwoDArray;

public class DiagonalSum {
    public static void main(String[] args) {
        int ar[][]={{1,2,3},{4,5,6},{7,8,9}};
        printDiagonal(ar);
    }

    public static void printDiagonal(int ar[][]){
        int sum=0;
       //using two loop 
        // for(int i=0;i<ar.length;i++){
        //     for(int j=0;j<ar[0].length;j++){
        //         if(i==j){
        //             sum+=ar[i][j];
        //         }
        //         else if(i+j==ar.length-1){
        //             sum+=ar[i][j];
                     
        //         }
        //     }
        // }
        // System.out.println(sum);

        //using one loop

        for(int i=0;i<ar.length;i++){
            sum+=ar[i][i];
            if(i!=ar.length-1-i){
                sum+=ar[i][ar.length-i-1];
            }
        }
        System.out.println(sum);
    }
}
