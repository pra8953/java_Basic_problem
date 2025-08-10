public class DigitOfNumber {
    public static void main(String[] args) {
        int num =145;
        int count = count(num);
        int d = (int) Math.pow(10,count-1);
        while (num>0) {
            System.out.println(num/=d);
            d/=10;
            // num/=10;
        }
    }
    public static int count(int num) {
         int count = 0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
}
