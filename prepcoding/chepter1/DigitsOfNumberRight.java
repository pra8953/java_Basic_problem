public class DigitsOfNumberRight {
    public static void main(String[] args) {
        int num = 12345;
        int d = (int)Math.pow(10, count(num)-1);


        while (num>0) {
            System.out.println(num/d );
            num = num%d;
            d = d/10;
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
