import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1 ");
        int num1 = input.nextInt();
        System.out.print("Enter num2 ");
        int num2 = input.nextInt();

        System.out.println(gcd(num1, num2));

        input.close();

    }

    public static int gcd(int num1, int num2) {

        
        for (int i = 2; i<Math.max(num1, num2);i++){
            if (num1% i == 0 && num2 % i == 0){
                return i;
            }
        }
        return 1;
        
    }
}
