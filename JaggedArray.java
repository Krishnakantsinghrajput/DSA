class JaggedArray{
    public static void main(String[] args) {
        int m=3;
        int ar[][]=new int[m][];
        for(int i=0;i<ar.length;i++){
             ar[i]=new int[i+1];
            for(int j=0;j<ar[i].length;j++){
ar[i][j]=i;
 System.out.print(ar[i][j]+" ");

            }
            System.out.println();
        }
    }
}