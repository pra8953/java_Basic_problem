import java.util.Scanner;

public class PrimeNumberNInput{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of Input: ");
        int num = input.nextInt();

        while(num>0){
            System.out.print("Enter number ");
            int number = input.nextInt();
            if(prime(number)){
                System.out.println(number+" is prime Number");
            }else{
                System.out.println(number+" is not prime number");
            }
            num--;
        }
        input.close();

    }

    public static boolean prime(int num){

        // it's brutforse approches


        // for(int i = 2; i<num; i++){
        //     if(num%i == 0){
        //         return false;
        //     }
        // }
        // return true;


        //optimize code

        if (num <= 1) return false; // 0, 1, negative numbers not prime
        
        for (int i = 2; i * i <= num; i++) { // √num tak check
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}