public class majority1 {
    public static void main(String arg[]){
      int[]   nums = {2,2,1,1,1,2,2};
      int majorityElement=findMajorityElement1(nums);
      System.out.println(majorityElement);
    }

    public static int findMajorityElement1(int nums[]){
        int candidate=0,count=0;
        for(int num:nums){
            if(count==0){
                candidate=num;
                count++;
            }
           count+=(num==candidate)?1:-1;
        }
        return candidate;
    }
}
