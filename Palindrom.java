public class Palindrom {
    public static void main(String[] args) {

        System.out.println(palindrom(1232123));
        
    }
    public static boolean palindrom(int num) {
        int actualNum = num;
        int reverseNumber = 0;
        while ( num>0) {
            reverseNumber = reverseNumber*10 + num%10;
            num/= 10;
        }
        if(reverseNumber == actualNum){
            return true;
        }

        return false;
    }
}
