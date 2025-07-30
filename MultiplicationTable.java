import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter number whose want to print table: ");
        int  num = input.nextInt();
        printTable(num);

        input.close();
    }


    public static void printTable(int num){
        for (int i= 1;i<=10;i++ ){
            System.out.printf("%d X %d = %d\n",num,i,(num*i));
        }
    }
}