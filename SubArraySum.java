public class SubArraySum {
    public static void main(String[] args) {
        int ar[]={1,2,3};
        int n=ar.length;
        printSubarray(ar, n);
    }
     
    public static void printSubarray(int ar[],int  n){
         int maxsum=Integer.MIN_VALUE;
         int currSum=0;
        for(int i=0;i<n;i++){
            
            for(int j=i;j<n;j++){
                currSum=0;
                for(int k=i;k<=j;k++){
                    currSum+=ar[k];
                   
              
                }
                 System.out.println(currSum);
                
                if(maxsum<currSum){
                    maxsum=currSum;
                  
                }
            
                  
            }
              
            }
            System.out.print("max sum:" +maxsum);
              
            
        }
       
    }



