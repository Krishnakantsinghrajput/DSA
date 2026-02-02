public class CountDistinctElement {
  public static void main(String[] args) {
      int ar[]={10,20,10,20,30};
      int count=CountDistinct(ar);
      System.out.println(count);
     
  }

  public static int CountDistinct(int ar[]){
    int count=0;
   
 for(int i=0;i<ar.length;i++){
     boolean isDistinct=true;
    for(int j=i-1;j>=0;j--){
        if(ar[i]==ar[j]){
            isDistinct=false;
            break;
        }
        
    }
    if(isDistinct==true){
            count++;
        }
 
 }
    return count;
  }

}
