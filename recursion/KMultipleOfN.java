public class KMultipleOfN {
    public static void main(String[] args) {
        int num = 3;
        int k = 8;
        kMultiplication(num, k);
    }

    public static void kMultiplication(int num,int k) {
        if(k<=0){
            return;
        }
        kMultiplication(num, k-1);
        System.out.println(num*k);
    }
}
