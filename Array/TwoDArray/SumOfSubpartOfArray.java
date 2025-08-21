public class SumOfSubpartOfArray {
    public static void main(String[] args) {
        int[][] a ={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int l1 = 1;
        int l2 = 2;
        int r1= 1;
        int r2 = 2;
        int sum = 0;

        for(int i = l1;i<=l2;i++){
            for(int j = r1;j<=r2;j++){
                sum+=a[i][j];
            }
        }
        System.out.println(sum);
    }
}
