public class FindMinimumRotatedSortedArray {
    public static void main(String args[]){
        int ar[]={3,4,5,1,2};
      int ans=  FindMinimum(ar);
      System.out.println(ans);

    }

    public static int FindMinimum(int ar[]){
        int left=0;
        int right=ar.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(ar[mid]>ar[right]){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return ar[left];
    }
}
