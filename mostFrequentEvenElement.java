class mostFrequentEvenElement{
    public static void main(String[] args) {
       int[]  nums = {0,1,2,2,4,4,1};
       int frequentEvenNumber=mostFrequentEvenElementFun(nums);
       System.out.println(frequentEvenNumber);
    }

    public static int mostFrequentEvenElementFun(int nums[]){
        int max=100001;
        int count[]=new int[max];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                count[nums[i]]++;
            }
        }
        int maxfreq=0;
        int result=-1;
        for(int i=0;i<count.length;i++){
            if(maxfreq<count[i]){
                maxfreq=count[i];
                result=i;
            }
        }
        return result;
    }
}