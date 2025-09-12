import java.util.*;

public class PascleTriangel {
    public static void main(String args[]){
        int r=5;
List<List<Integer>> ans= PascleTriangelFun(r);
for(List<Integer> i:ans){
    System.out.println(i+" ");

}

    } 

    public static List<List<Integer>> PascleTriangelFun(int r){
        List<List<Integer>> res=new ArrayList<>();
if(r<=0){
    return res;
}

for(int i=0;i<r;i++){
    List<Integer> rows=new ArrayList<>(i+1);
    for(int j=0;j<=i;j++){
        if(j==0 || j==i){
            rows.add(1);
        }
        else{
            rows.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
        }
 
    }

    res.add(rows);
}

return res;
    }
}
