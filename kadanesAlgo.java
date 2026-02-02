public class kadanesAlgo {
    public static void main(String[] args) {
        int ar[]={-2,-3,4,-1,-2,1,5,-3};
        kadansalgo(ar);
    }

    public static void kadansalgo(int ar[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<ar.length;i++){
            cs+=ar[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }

        System.out.println("max subaaray sum is :" + ms);
    }
}
