public class kokoEatingBanana {
    public static void main(String args[]){
        int  piles[] = {3,6,7,11}, h = 8;
        int ans=minEatingSpeed(piles, h);
        System.out.println(ans);
    }

    public static int minEatingSpeed(int piles[],int h){
        int left=1;
        int right=0;
        for(int pile:piles){
right=Math.max(right,pile);
        }

        while(left<right){
            int mid=left+(right-left)/2;
            if(CanEatAllBananas(piles,h,mid)){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }

    public static boolean CanEatAllBananas(int piles[],int h,int speed){
        int hours=0;
        for(int p:piles){
            hours+=(p+speed-1)/speed;
             if(hours>h){
            return false;
        }
        }
       
        return true;
    }
}
