import java.util.Scanner;

class Pattern11{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int number = 1;
        for(int i = 1; i<=num;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }

        input.close();
    }
}