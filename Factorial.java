import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number ");
        int num = input.nextInt();
        System.out.println(fact(num));
        input.close();
    }
    public static long fact(int num){
        long result = 1;
        for(int i = 1; i<=num;i++){
            result *= i;
        }
        return result;
    }
}
