public class LastOccurenceOfElement {
    public static void main(String[] args) {
        int nums[] = {5,7,7,8,8,8,10}, target = 8;
        int ans=LastOccurence(nums,target);
        System.out.println(ans);
    }

    public static int LastOccurence(int nums[],int target){
        int low=0;
        int high=nums.length-1;int last=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                last=mid;
                low=mid+1;

            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return last;
    }
}
