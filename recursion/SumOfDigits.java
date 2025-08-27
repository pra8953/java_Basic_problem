public class SumOfDigits {
    public static void main(String[] args) {
        int num = -513212;
        System.out.println(sumOfDigits(num));;

    }
    public static int sumOfDigits(int num){

         num = Math.abs(num);
        if(num<10){
            return num;
        }

        return num%10 + sumOfDigits(num/10);
        

    }
}
