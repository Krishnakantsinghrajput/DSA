package TwoDArray;

public class SortedSearchBruteF {
    public static void main(String[] args) {
        int mat[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key=50
        ;
        boolean res=SearchFun(mat, key);
        System.out.println(res);
    }

    public static boolean SearchFun(int mat[][],int key){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==key){
                    System.out.print(mat[i][j] +" found at index :("+ i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("no key found");
        return false;

    }
}
