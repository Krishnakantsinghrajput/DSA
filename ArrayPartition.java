import java.util.*;
class Arraypartition{
    public static void main(String args[]){
        int ar[]={1,4,3,2};
        int ans=Partition(ar);
        System.out.println(ans);
    }

    public static int Partition(int ar[]){
        int sum=0;
        Arrays.sort(ar);
        for(int i=0;i<ar.length;i+=2){
sum+=ar[i];
        }
        return sum;
    }
}