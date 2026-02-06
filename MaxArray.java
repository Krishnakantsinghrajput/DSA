public class MaxArray {
    public static void main(String[] args) {
        int ar[]={99,20,50,60,-1};
        int ans=maxElement(ar);
        System.out.println(ans);
    }

    public static int maxElement(int ar[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            if(max<ar[i]){
                max=ar[i];
            }

        }
        return max;
    }
}
