public class subArray {
    public static void main(String[] args) {
        // int nums[]={1,2,3,4};
        int nums[]={3,2,-2,4};
        printSubArray(nums);

    }

    public static void printSubArray(int nums[]){
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                for(int k=i;k<=j;k++){
            System.out.print(nums[k]+" ");
          }
          System.out.println();
            }
        

        }
    }
}
