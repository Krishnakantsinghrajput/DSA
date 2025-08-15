public class PeakElemnt {
    public static void main(String args[]){
       int  nums[] = {1,2,1,3,5,6,4};
       int peak=FindPeak(nums);
       System.out.println("peak element is:"+nums[peak]+" and it's index is: " +peak);
    }

    public static int FindPeak(int nums[]){
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]>nums[mid+1]){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;

    }
}
