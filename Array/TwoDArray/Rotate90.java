
public class Rotate90 {

    public static void printArray(int[][]a){
        for(int i = 0; i<a.length;i++){
            for(int j =0; j<a.length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void reverseArray(int[] a ){
        int left = 0;
        int right = a.length-1;
        while (left<right) {
            a[left] = a[left]+ a[right];
            a[right] = a[left]-a[right];
            a[left] = a[left]-a[right];
            left++;
            right--;
        }
    }

    public static void tranposeArray(int[][] a){
         for(int i =0; i<a.length;i++){
            for(int j = i+1;j<a.length;j++){
                a[i][j] = a[i][j]+a[j][i];
                a[j][i] = a[i][j]-a[j][i];
                a[i][j] = a[i][j]-a[j][i];
            }
        }
    }
    public static void main(String[] args) {
        int[][] a ={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("before rotation");
        printArray(a);
       
        System.out.println("after rotation");
            tranposeArray(a);

        for(int i =0; i<a.length;i++){
            reverseArray(a[i]);
        }
        
        printArray(a);
        
    }
}
