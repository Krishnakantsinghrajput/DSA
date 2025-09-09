public class SpiralMatrix4 {
    public static void main(String[] args) {
        int m = 3, n = 5;
        //  head = [3,0,2,6,8,1,7,9,4,2,5,5,0};
         Node head=new Node(3);
         head.next=new Node(0);
         head.next.next=new Node(2);
         head.next.next.next=new Node(6);
         head.next.next.next.next=new Node(8);
         head.next.next.next.next.next=new Node(1);
         head.next.next.next.next.next.next=new Node(7);
         head.next.next.next.next.next.next.next=new Node(9);
         head.next.next.next.next.next.next.next.next=new Node(4);
         head.next.next.next.next.next.next.next.next.next=new Node(2);
         head.next.next.next.next.next.next.next.next.next.next=new Node(5);
        head.next.next.next.next.next.next.next.next.next.next.next=new Node(0);

        int [][] result=Spiral_Matrix(m, n, head);
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[i].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] Spiral_Matrix(int m,int n,Node head){
        int res[][]=new int[m][n];

        //intilize res with -1
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[i][j]=-1;
            }
        }
        int top=0,bottom=m-1;
        int left=0,right=n-1;

        while(head!=null){
            //left==>right
            for(int i=left;i<=right &&head!=null;i++){
                res[top][i]=head.data;
                head=head.next;
            }
            top++;

            //top==>bottom

            for(int j=top;j<=bottom && head!=null;j++){
                res[j][right]=head.data;
                head=head.next;
            }
            right--;

            //right==>left

            for(int i=right;i>=left && head!=null;i--){
                res[bottom][i]=head.data;
                head=head.next;
            }
            bottom--;
//bottom==>top
            for(int j=bottom;j>=top && head!=null ;j--){
                res[j][left]=head.data;
                head=head.next;

            }
            left++;
        }
        return res;
    }
}

class Node{
    int data;
    Node next;
    Node(int x){
        this.data=x;
        this.next=null;
    }
}
