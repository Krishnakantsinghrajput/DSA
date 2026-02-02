import java.util.*;
public class Three_sum_closest {
    public static void main(String[] args) {
        int []nums = {-1,2,1,-4};
        int target = 1;
        int ans=Three_sum_closest_fun(nums, target);
        System.out.println(ans);
    }

    public static int Three_sum_closest_fun(int nums[],int target){
        Arrays.sort(nums);
        int n=nums.length;
        int closest=nums[0]+nums[1]+nums[2];
        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(Math.abs(sum-target)<Math.abs(closest-target)){
                    closest=sum;
                }
                if(sum<target){
                    left++;
                }
                else if(sum>target){
                    right--;
                }
                else{
                    return sum;
                }
            }
        }
        return closest;

    }
}
