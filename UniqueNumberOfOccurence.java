public class UniqueNumberOfOccurence {
    public static void main(String[] args) {
    //  int[]    arr = {1,2,2,1,1,3};  return true
      int[]    arr ={1,2};  //return false
     boolean result=UniqueOccurence(arr);
     System.out.println(result);
    }

    public static boolean UniqueOccurence(int arr[]){
        int offset=1000; //for handling negative values
        int freq[]=new int[2001] ; //2001 taken because constraint is b/w -1000 to 1000
        //count frequency of each element
        for(int i=0;i<arr.length;i++){
            freq[arr[i]+offset]++;
        }

        boolean used[]=new boolean[arr.length+1]; //max freq of element <=arr.length
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                if(used[freq[i]]){
                    return false; //duplicate is found
                }
                used[freq[i]]=true;
            }
        }
        return true;
    }
}
