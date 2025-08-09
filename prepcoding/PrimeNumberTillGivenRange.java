import java.util.Scanner;

public class PrimeNumberTillGivenRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter range");
        System.out.print("Enter starting range: ");
        int s = input.nextInt();
        System.out.print("Enter ending range: ");
        int e = input.nextInt();

        primeNumber(s, e);
        input.close();
    }

    public static void primeNumber(int s, int e) {
        for (int i = s; i <= e; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;      // 0, 1, negative -> not prime
        if (num == 2) return true;       // 2 -> prime
        if (num % 2 == 0) return false;  // even -> not prime

        // check only odd divisors
        for (int j = 3; j * j <= num; j += 2) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }
}
