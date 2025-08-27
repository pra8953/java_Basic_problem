public class NumberOfDigits {
    public static void main(String[] args) {
        System.out.println(numOfDigits(123677978));
    }

    static int count = 1;
    public static int numOfDigits(int num) {
            if (num <10){
                return 1;
            }

           
            return 1+ numOfDigits(num/10);



    }
}
