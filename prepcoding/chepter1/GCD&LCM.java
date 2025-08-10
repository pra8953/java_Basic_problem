import java.util.Scanner;

class GcdLcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number  ");
        int  num1 = input.nextInt();
        System.out.print("Enter second number ");
        int  num2 = input.nextInt();

        gcd(num1, num2);
        lcm(num1, num2);
        input.close();



    }

    public static int gcd(int num1, int num2) {
        int rem =0;
        while (num1% num2 != 0) {
             rem = num1% num2;
            num1 = num2;
            num2 = rem;

        }
        System.out.println(num2);
        return num2;
    }

    public static void lcm(int num1,int num2) {
        int lc = num1*num2/gcd(num1, num2);
        System.out.println(lc);
    }
}
