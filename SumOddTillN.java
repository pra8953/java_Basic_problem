import java.util.Scanner;

public class SumOddTillN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number");
        int num = input.nextInt();
        System.out.println(sumOdd(num));
        input.close();
        
    }

    public static int sumOdd(int num){
        int sum = 0 ;
        for (int i = 1; i<=num;i+=2){
            sum+= i;
        }
        return sum;
    }
}
