public class maximum_subarray_product {
    public static void main(String[] args) {
         int nums[] = {2,3,-2,4};
         int max_Product=max_product(nums);
         System.out.println(max_Product);
    }
    public static int max_product(int nums[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int product=1;
            for(int j=i;j<nums.length;j++){
                product*=nums[j];
                max=Math.max(max, product);

            }
        }
        return max;
    }
}
