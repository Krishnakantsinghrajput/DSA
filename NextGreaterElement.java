import java.util.Arrays;

public class NextGreaterElement {
    public static void main(String[] args) {
        int nums[]={4,1,2};
        int nums1[]={1,3,4,2};
        int ans[]=Nextgreater(nums,nums1);
        System.out.println(Arrays.toString(ans));

    }

    public static int [] Nextgreater(int nums[],int nums1[]){
        int ar[]=new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int nxt=-1;
            for(int j=0;j<nums1.length;j++){
                if(num==nums1[j]){
                    for(int k=j+1;k<nums1.length;k++){
                        if(num<nums1[k]){
                            nxt=nums1[k];
                            break;
                        }
                       
                    }
                     break;

                }
               
            }
             ar[i]=nxt;
           
        }
         return ar;
    }
}
