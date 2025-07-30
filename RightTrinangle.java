public class RightTrinangle {
    public static void main(String[] args) {
        rightTrinangle(51);
    }

    public static void rightTrinangle(int num) {
            for(int i = 1; i<=num;i++){
                for(int j = num; j>i;j--){
                    System.out.print(" ");
                }
                for(int k = 0;k<i;k++){
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}
