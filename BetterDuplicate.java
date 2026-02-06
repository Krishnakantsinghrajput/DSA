import java.util.HashMap;

public class BetterDuplicate {
    
    public static void main(String[] args) {
        int nums[]={1,2,3,4,2,2};
        int ans=DuplicateFun(nums);
        System.out.println(ans);
    }

    public static int DuplicateFun(int nums[]){
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            if(map.get(nums[i])==2){
                return nums[i];
            }
        }
        return -1;
    }
}
