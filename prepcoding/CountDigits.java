public class CountDigits {
    public static void main(String[] args) {
        countDigits(123);
    }

    public static void countDigits(int num) {
        int count = 0;
        while(num>0){
            count++;
            num/=10;
        }
        System.out.println(count);
    }
}
