import java.util.*;

public class three_sum_naive {
    public static void main(String args[]){
       int []  nums = {-1,0,1,2,-1,-4};
       List<List<Integer>> result=threeSum(nums);
       for(List<Integer> i:result){
        System.out.print(i);
       }
    }

 public static List<List<Integer>> threeSum(int[] nums) {
int n=nums.length;
Set<List<Integer>> set=new HashSet<>();
for(int i=0;i<n-2;i++){
    for(int j=i+1;j<n-1;j++){
        for(int k=j+1;k<n;k++){
            if(nums[i]+nums[j]+nums[k]==0){
                List<Integer> triplets=Arrays.asList(nums[i],nums[j],nums[k]);
                Collections.sort(triplets);
                set.add(triplets);
            }
        }
    }
}
return new ArrayList<>(set);
        
    }
}
