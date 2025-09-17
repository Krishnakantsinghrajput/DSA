import java.util.*;
public class DuplicateArray2 {
    public static void main(String[] args) {
        int nums[] = {1,1,1,2,2,3};
        int ans=removeDuplicate2(nums);
        System.out.println(ans);
        
    }

    public static int removeDuplicate2(int nums[]){
        if(nums.length<=2){
            return nums.length;
        }
int ar[]=new int[nums.length];
        int k=2;
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[i-2]){
ar[i]=nums[i];
k++;
            }
        }

        return k;
    }
}
