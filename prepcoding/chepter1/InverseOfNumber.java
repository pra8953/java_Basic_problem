import java.util.Scanner;

public class InverseOfNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");

        int number = input.nextInt();

        // System.out.println(checkValidNumber(number, countDigits(number)));

        if(checkValidNumber(number, countDigits(number))){
            inverseOfNumber(number,countDigits(number));
        }
        else{
            System.out.println("Enter valid input");
        }
        input.close();


    }


    public static int countDigits(int num) {
        int count = 0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
        
    }

    public static boolean checkValidNumber(int num, int count) {
        int data = num;
        int check = 0;
        for(int i = 1; i<=count;i++){
            while (data>0) {
                if(i==data%10){
                    check++;
                    break;
                }
                data /=10;
            }
            data = num;
        }

        if(check==count){
            return true;
        }
        return false;
    }

    // public static void inverseOfNumber(int num,int count) {
    //      int invNum = 0;
    // for(int pos = 1; pos <= count; pos++){
    //     int digit = num % 10;    // current digit
    //     num /= 10;               // remove last digit
    //     invNum += (int)(digit * Math.pow(10, pos - 1));
    // }
    // System.out.println(invNum);
    // }



    public static void inverseOfNumber(int num, int count) {
    int invNum = 0;
    for (int pos = 1; pos <= count; pos++) {
        int digit = num % 10;
        num /= 10;
        invNum += (int)(digit * Math.pow(10, pos - 1));
    }
    System.out.println(invNum);
}

}