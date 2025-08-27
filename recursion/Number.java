public class Number {
    public static void main(String[] args) {
        int n = 5;
        printNumber(n);
    }

    public static void printNumber(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printNumber(n-1);
    }
}
