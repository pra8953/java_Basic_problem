public class ArmStrong {
    public static void main(String[] args) {
        System.out.println(arm(1));
    }

    public static boolean arm(int num) {

        int count = 0;
        
        while (num >0) {
            count++;
            num /= 10;
        }
        int result = 0;
        while (num>0) {
           result += Math.pow(num%10, count) ;
           num/=10;
        }

        if(result== num){
            return true;
        }

        return false;
    }
}
