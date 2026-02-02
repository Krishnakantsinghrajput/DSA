public class CheckArraySorted {
    public static void main(String[] args) {
     //using two loop
        // int ar[]={10,20,10,40,50};
        // boolean ans=true;
        // for(int i=0;i<ar.length;i++){
        //     for(int j=0;j<ar.length-1;j++){
              
        //         if(ar[j]>ar[j+1]){
        //             ans=false;
        //             break;
                    
        //         }
                 
        //     }
        // }
        // if(ans==false){
        //     System.out.println("array is not sorted");

        // }
        // else{
        //     System.out.println("array sorted");
        // }


int ar[]={10,50,200};
 int n=ar.length;
boolean ans=isSorted(ar,n);
if(ans==true){
    System.out.println("array is sorted");
}
else{
    System.out.println("Array is not sorted");
}


    }

    public static  boolean isSorted(int ar[],int n){
       
        for(int i=1;i<n;i++){
            if(ar[i]<ar[i-1]){
                return false;
            }
        }
        return true;
    }
}
