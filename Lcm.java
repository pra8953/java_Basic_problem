import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1 ");
        int num1 = input.nextInt();
        System.out.print("Enter num2 ");
        int num2 = input.nextInt();
        System.out.println(lcm(num1,num2));;
        input.close();
    }

    public static int lcm(int num1, int num2){
        int i = 1;
        while (true) {
            if(num1*i %num1==0 && num1*i%num2 ==0){
                return num1*i;
            }
            i++;
        }
       
    }
}
