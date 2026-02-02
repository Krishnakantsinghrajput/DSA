public class SortAnArrayIncreasingFrequency {
    public static void main(String args[]){
        int []nums = {2,3,1,3,2};
        int[] sortedArray=fun(nums);
        for(int i:sortedArray){
System.out.print(i+" ");
        }
    }

    public static int [] fun(int nums[]){
        int n=nums.length;
        int offset=100;
        int max=201;
        int count[]=new int[max];
        for(int i=0;i<n;i++){
count[nums[i]+offset]++;
        }
        int result[]=new int[n];
        int index=0;
        for(int freq=1;freq<=n;freq++){
            for(int i=max-1;i>=0;i--){
                if(count[i]==freq){
                    for(int j=0;j<freq;j++){
                        result[index++]=i-offset;
                    }
                }
            }
        }
        return result;
    }
}
