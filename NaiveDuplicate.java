public class NaiveDuplicate {
    public static void main(String[] args) {
        int nums[] = {1, 3, 4, 2,2, 2};
       int ans= DuplicateFun(nums);
       System.out.println(ans);
    }

    public static int DuplicateFun(int nums[]){

        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
if(nums[i]==nums[j]){
   return nums[i];
   

}
            }
        }
        return -1;
    }
}
