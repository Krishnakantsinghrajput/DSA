public class BestDuplicate {
    public static void main(String[] args) {
        int nums[]={1,2,3,2,2,2};
        int ans=DuplicateFun(nums);
        System.out.println(ans);
    }

    public static int DuplicateFun(int nums[]){
        int n=nums.length;

        int slow=nums[0];
        int fast=nums[0];

        while(true){
            slow=nums[slow];
            fast=nums[nums[fast]];
            if(slow==fast){
                break;
            }
        }

        slow=nums[0];
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];

        }
        return slow;
    }
}
