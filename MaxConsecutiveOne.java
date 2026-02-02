public class MaxConsecutiveOne {
    public static void main(String[] args) {
        int nums[]={1,1,0,1,1,1};
        int result=MaxConsecutiveOneFun(nums);
        System.out.println(result);
    }

    //using sliding window
    // public static int MaxConsecutiveOneFun(int nums[]){
    //     int maxlen=0;
    //     int left=0;
    //     for(int right=0;right<nums.length;right++){
    //         if(nums[right]==0){
    //             left=right+1;
    //         }
    //         maxlen=Math.max(maxlen,right-left+1);
    //     }
    //     return maxlen;
    // }


    //using naive appoarch 
     public static int MaxConsecutiveOneFun(int nums[]){
        int count=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                if(max<count){
                    max=count;
                }

            }
            else{
                count=0;
            }
        }
        return max;
    }
}
