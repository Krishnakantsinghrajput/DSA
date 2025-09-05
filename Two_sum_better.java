import java.util.*;
public class Two_sum_better {
    public static void main(String[] args) {
          int nums[]= {2,7,11,15};
        int target = 9;
         int result[]=Two_sum(nums, target);
        System.out.println(Arrays.toString(result));
    }

     public static int[] Two_sum(int nums[],int target){
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        int compliment=target-nums[i];
        if(map.containsKey(compliment)){
            return  new int []{map.get(compliment),i};
        }
        map.put(nums[i], i);
       }
        return new int[]{}; //return empty array if nums[i]+nums[j]!=target
    }
}
