public class pow {
    public static void main(String[] args) {
        double x=2.0;int n=9;
        double res=Powerfun(x, n);
        System.out.println(res);
    }

    public static double Powerfun(double x,int n){
       long N=n;
       
        if(N<0){
            x=1/x;
            N=-N;
        }
        double ans=1.0;
        while(N>0){
             if(N%2==1){
                ans*=x;
             }
             x*=x;
            N/=2;
        }
        return ans;
    }
}
