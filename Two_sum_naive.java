import java.util.Arrays;

public class Two_sum_naive {
    public static void main(String args[]){
        int nums[]= {2,7,11,15};
        int target = 9;
        int result[]=Two_sum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] Two_sum(int nums[],int target){
        for(int i=0;i<nums.length-1;i++){   //runs (nums.length-1)because the last element (i = n-1) has no partner to compare with.
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};       //return the index of element index whose sum is equal to target
                }
            }
        }
        return new int[]{}; //return empty array if nums[i]+nums[j]!=target
    }
}
