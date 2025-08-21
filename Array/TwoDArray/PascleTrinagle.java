
public class PascleTrinagle {
    public static void main(String[] args) {
        int n = 5;
        int a[][] = new int [n][];

        for(int i =0; i<a.length;i++){
            a[i] = new int [i+1];
            a[i][0] = a[i][i] =1;
            for(int j =1;j<i;j++){
                a[i][j] = a[i-1][j]+a[i-1][j-1];
            }

        }
    }
}
