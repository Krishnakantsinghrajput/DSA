public class SubArray {
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5};
        int n=ar.length;
        printSubarray(ar, n);
       

    }
    public static void printSubarray(int ar[],int  n){
        int sum=0;
        int maxsum=0;
        for(int i=0;i<n;i++){
            
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(ar[k]+" ");
              
                }
              System.out.println();
                  
            }
              
            }
            System.out.println();
        }
       
    }

