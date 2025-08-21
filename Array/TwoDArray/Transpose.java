


public class Transpose {

    public static void printArray(int[][]a){
        for(int i =0; i<a.length;i++){
            for(int j =0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] a = {{1,2},{4,5},{7,8}};
        System.out.println("Before tranpose array");
        printArray(a);
        int[][] t = new int [a[0].length][a.length];
        // yeh code work only of squre matrix ;


        // for(int i = 0; i<a.length;i++){
        //     for(int j = i+1;j<a[i].length;j++){
        //         if(i!=j){ 
        //             a[i][j] = a[i][j]+a[j][i];
        //             a[j][i] = a[i][j]-a[j][i];
        //             a[i][j] = a[i][j]-a[j][i];
        //         }
        //     }
        // }

        for(int i =0 ; i<a[0].length;i++){
            for (int j = 0; j<a.length;j++){
             
                    t[i][j] = a[j][i];
               
            }
        }


        System.out.println("after tranpose array");
        printArray(t);
    }
}
