import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number ");
        int num = input.nextInt();
        System.out.println(prime(num));
        input.close();
    
    }

    public static boolean prime(int num){

        for(int i = 2; i<num;i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
