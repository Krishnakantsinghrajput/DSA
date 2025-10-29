public class SingleElementINSortedArray {
    public static void main(String[] args) {
        int nums[]={1,1,2,3,3,4,4,8,8};
        int ans=fun(nums);
        System.out.println(ans);
    }

    public static int fun(int nums[]){
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor^=nums[i];
        }
        return xor;
    }
}
