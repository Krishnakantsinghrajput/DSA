public class FirstOccurenceOfElement {
    public static void main(String[] args) {
       int nums[] = {5,7,7,8,8,10}, target = 8;int first=-1;
       int ans=FirstOccurence(nums,target,first);
       System.out.println(ans+" ");
        
    }

    public static int FirstOccurence(int nums[],int target,int first){
        int low=0;
        int high=nums.length-1;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
first=mid;
high=mid-1;
            }
            else if(nums[mid]<target){
low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return first;

    }
}
