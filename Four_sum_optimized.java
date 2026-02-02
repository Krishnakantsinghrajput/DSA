import java.util.*;
public class Four_sum_optimized {
    public static void main(String[] args) {
        int []nums = {1,0,-1,0,-2,2};
        int target = 0;

        List<List<Integer>>ans=four_sum(nums, target);
        for(List<Integer> i:ans){
            System.out.print(i+" ");
        }
    }

    public static List<List<Integer>> four_sum(int nums[],int target){
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>>res=new ArrayList<>();
        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                int left=j+1,right=n-1;
                while(left<right){
                    long sum=(long)nums[i]+nums[j]+nums[left]+nums[right];

                    if(sum==target){
                        res.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        right--;

                        while(left<right && nums[left]==nums[left-1]){
                            left++;
                        }
                        while (left<right && nums[right]==nums[right-1]) {
                            right--;
                            
                        }
                    }
                    else if(sum<target){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
        }
        return res;
    }
}
