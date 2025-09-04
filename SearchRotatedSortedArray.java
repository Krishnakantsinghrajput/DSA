public class SearchRotatedSortedArray {
    public static void main(String args[]){
        int nums[]={4,5,6,7,8,9,0,1,2}, target = 0;
        int index=findIndexOfTarget(nums, target);
        System.out.println(index);
    }

    public static int findIndexOfTarget(int nums[],int target){
        int left=0,right=nums.length-1;
        while (left<=right) {
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[left]<=nums[mid]){
                if(nums[left]<=target && target<nums[mid]){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            else{
                if(nums[mid]<target && target<=nums[mid]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
            
        }
        return -1;
    }
}
