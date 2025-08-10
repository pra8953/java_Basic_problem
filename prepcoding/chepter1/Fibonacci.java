public class Fibonacci {
    public static void main(String[] args) {
        fibonacci(10);
    }

    public static void fibonacci(int num){
        int f = 0;
        int s = 1;
        System.out.print(f+" ");
        System.out.print(s+" ");

        for(int i = 2;i<num;i++){
            int third = f+s;
            System.out.print(third+" ");
            // int h = s;
            f = s;
            s = third;
        }
    }
}
