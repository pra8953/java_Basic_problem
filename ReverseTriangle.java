public class ReverseTriangle {
    public static void main(String[] args) {
        reverseTriangle(5);
    }


    public static void reverseTriangle(int num) {
        for(int i = 0; i<num;i++){
            for(int j = num; j>i;j--){
                System.out.print("* ");
            }
             System.out.println();
        }
       
    }
}
