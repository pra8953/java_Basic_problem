
public class TwoArray {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}, {5, 6}};   // 3x2 matrix
        int[][] b = {{1, 2, 3}, {4, 5, 6}};     // 2x3 matrix

       int r1 = a.length;       // 3 (rows of A)
        int c1 = a[0].length;    // 2 (cols of A)
        int r2 = b.length;       // 2 (rows of B)
        int c2 = b[0].length; 
        int [][]c = new int[r1][c2];
         if (c1 != r2) {
            System.out.println("Matrix multiplication not possible");
            return;
        }

        for(int i = 0; i<r1;i++){
            for(int j= 0;j<c2;j++){
                for(int k = 0; k<c1;k++){
                    c[i][j] +=a[i][k] *b[k][j];
                } 
            }
        }

        for(int i = 0; i<r1;i++){
            for (int j=0;j<c2;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
