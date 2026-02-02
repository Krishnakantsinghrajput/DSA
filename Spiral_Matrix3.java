public class Spiral_Matrix3 {
    public static void main(String[] args) {
        int  rows = 5, cols = 6, rStart = 1, cStart = 4;
        int [][] result=Spiral_Matrix3_fun(rows, cols, rStart, cStart);
         for(int i=0;i<result.length;i++){
            for(int j=0;j<result[i].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] Spiral_Matrix3_fun(int rows, int cols ,int rStart,int cStart ){
        int result[][]=new int[rows*cols][2];
        int count=0;
        
        // directions: right, down, left, up
        int directions[][]={{0,1},{1,0},{0,-1},{-1,0}};

          int len = 0;  // steps to move in current direction
        int d = 0;    // direction index
        result[count++] = new int[]{rStart, cStart};

        while (count < rows * cols) {
            if (d == 0 || d == 2) len++; // increase step size after every 2 turns

            for (int i = 0; i < len; i++) {
                rStart += directions[d][0];
                cStart += directions[d][1];

                if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
                    result[count++] = new int[]{rStart, cStart};
                }
            }

            d = (d + 1) % 4; // rotate direction
        }

        return result;

    }
}
