    class practice{
        public static void main(String[] args) {
           int ar[]={1,2,3,4};
          
countdis(ar);
 
             
        }

        public static void countdis(int ar[]){
            int n=ar.length;
           int maxSum = ar[0];
 
           int prefix[]=new int[n];
           prefix[0]=ar[0];
           for(int k=1;k<n;k++){
            prefix[k]=ar[k]+prefix[k-1];
           }
           for(int i=0;i<n;i++){
          
            for(int j=i;j<n;j++){
                 int sum=0;
                 if(i==0){
                    sum=prefix[j];
                 }
                 else{
                    sum=prefix[j]-prefix[i-1];
                 }   
                   maxSum = Math.max(maxSum, sum);

             
            }
          
           }
             System.out.println("max multiply :"+maxSum);
           
        }
       
         
               
           
        
        
    }