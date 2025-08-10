import java.util.Scanner;

public class BenjaminBulbs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        benjamin(num);

        input.close();
    }

    public static void benjamin(int num) {
        int i = 1;
        while (i*i<=num) {
            System.out.println(i*i);
            i++;
        }
    }
}
