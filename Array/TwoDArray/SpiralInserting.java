public class SpiralInserting {
   public static void main(String[]args) {
    int n = 5;
    int [][] a =new int [n][n];

    int currentElement = 1;
    int topRow = 0;
    int bottomRow = a.length-1;
    int leftColum = 0;
    int rightColum = a[0].length-1;


    while(currentElement<=n*n){
      for(int i = leftColum; i<=rightColum && currentElement<=n*n;i++){
         // System.out.println(currentElement);
         a[topRow][i] = currentElement++;
      }
      topRow++;


      for(int i = topRow;i<=bottomRow && currentElement<=n*n;i++){
         // System.out.println(currentElement);
         a[i][rightColum] = currentElement++;
      }

      rightColum--;

      for(int i = rightColum;i>=leftColum && currentElement<=n*n;i--){
         // System.out.println(currentElement);

         a[bottomRow][i] = currentElement++;
      }
      bottomRow--;


      for(int i = bottomRow;i>=topRow && currentElement<=n*n;i--){
         // System.out.println(currentElement);

         a[i][leftColum] = currentElement++;
      }
      leftColum++;

    }
    for(int i =0; i<a.length;i++){
      for(int j =0; j<a[i].length;j++){
         // System.out.println(currentElement);

         System.out.print(a[i][j]+" ");
      }
      System.out.println();
    }
   }
}
