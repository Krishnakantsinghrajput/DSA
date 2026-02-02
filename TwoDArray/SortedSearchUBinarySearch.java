package TwoDArray;

public class SortedSearchUBinarySearch {
    public static void main(String[] args) {
         int mat[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key=39;
        boolean asn=SearchFun(mat, key);
        System.out.println(asn);
        ;
    }

    public static boolean SearchFun(int mat[][], int key){
        for(int i=0;i<mat.length;i++){
            int left=0; 
            int right=mat[0].length-1;
            while(left<=right){
                int mid=(left+right)/2;
                if(mat[i][mid]==key){
                    return true;
                }
                else if(mat[i][mid]<key){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        }return false;

    }
}
