import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number ");
        int num = input.nextInt();
        System.out.print("Enter number of rotations ");
        int k = input.nextInt();
        rotations(num, k);

        input.close();
    }

    public static void rotations(int num , int k) {
        int res =num;
        for(int i = 1; i<= k; i++){
            int r = res%10;
            res = (int) ((int) r*Math.pow(10, countDigits(num)-1)+res/10);
            
        }
        System.out.println(res);
    }

    public static int countDigits(int num) {
        int count = 0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
}
