import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number:");
        int number = input.nextInt();
        System.out.println(sumOfDigits(number));
        input.close();
    }

    public static int sumOfDigits(int num){
        int sum = 0;
        while (num>0) {
            sum += num%10;
            num/=10;
        }
        return sum;

    }
}
