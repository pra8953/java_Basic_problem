public class RightTriangle {
    public static void main(String[] args) {
        pattern(50);
    }

    public static void pattern(int num) {
        for(int i = 1; i<=num; i++){
            for(int j =0; j< i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
