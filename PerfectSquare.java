public class PerfectSquare {
   public static void main (String args[]){
    int n=12;
    int res=numSquares(n);
    System.out.println(res);
   } 
    public  static int numSquares(int n) {
//         int sum=0;
//         for(int i=2;i*i<n;i++){
// // sum++;
// if(n%2==0){
//      int k=i*i;
// while(k<=n){

//  k+=k;
// sum++;
// }}
// else{
//     sum++;
// }

//         }return sum;



for(int i=1;i*i<=n;i++){
    if(i*i==n){
        return 1;
    }
}

for(int i=1;i*i<=n;i++){
    for(int j=1;j*j<=n;j++){
    if(i*i+j*j==n){
        return 2;
    }
}}

for(int i=1;i*i<=n;i++){
    for(int j=1;j*j<=n;j++){
    for(int k=1;k*k<=n;k++){
        if(i*i+j*j+k*k==n){
        return 3;
    }
    }
}}
return 4;
    }
}
