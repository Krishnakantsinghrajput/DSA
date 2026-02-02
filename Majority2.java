import java.util.*;
public class Majority2 {
    public static void main(String[] args) {
         int []nums = {2,2,1,1,1,2,2};
         List<Integer> result= findMajorityElement2(nums);
         System.out.println(result);
    }

    public static List<Integer> findMajorityElement2(int nums[]){
        List<Integer> ans=new ArrayList<Integer>();
        if (nums==null||nums.length==0 ){
            return ans;
        }

        int candidate1=0,candidate2=0,count1=0,count2=0;
        for(int num:nums){
            if(num==candidate1){
                count1++;
            }
            else if(num==candidate2){
                count2++;
            }
            else if(count1==0){
                candidate1=num;
                count1=1;
            }
            else if(count2==0){
                candidate2=num;
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }

        int cont1=0,cont2=0;
        for(int num:nums){
            if(num==candidate1){
                cont1++;
            }
            else if(num==candidate2){
                cont2++;
            }
        }
        if(cont1>nums.length/3){
            ans.add(candidate1);
        }
          if(cont2>nums.length/3){
            ans.add(candidate2);
        }
        return ans;
    }
}
