

public class SpairalTraversing {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {14, 15, 16, 17}
        };

        int r = a.length;
        int c = a[0].length;

        int leftC = 0, rightC = c - 1;
        int topR = 0, bottomR = r - 1;

        int total = 0;
        int totalElements = r * c;

        while (total<totalElements) {
            
            for(int j = leftC;j<=rightC && total < totalElements;j++){
                System.out.println(a[topR][j]);
                total++;
            }
            topR++;

            for(int j=topR;j<=bottomR && total < totalElements ;j++){
                System.out.println(a[j][rightC]);
                total++;
            }
            rightC--;

            for(int j =rightC; j>=leftC && total < totalElements;j--){
                System.out.println(a[bottomR][j]);
                total++;
            }
            bottomR--;

            for(int j = bottomR;j>=topR && total < totalElements;j--){
                System.out.println(a[j][leftC]);
                total++;
            }
            leftC++;
        }
    }
}
