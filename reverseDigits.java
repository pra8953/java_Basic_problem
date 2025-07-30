import java.util.Scanner;

public class reverseDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number");
        int number = input.nextInt();
        System.out.println(reversedigit(number));
        input.close();
    }

    // public static int reversedigit(int num){
    //     int revesrdigit = 0;
    //     while (num>0) {
    //        revesrdigit = revesrdigit*10+ num%10;
    //        num/=10; 
    //     }
    //     return revesrdigit;
    // }
     public static int reversedigit(int num){
        int revesrdigit = 0;

       for(int i = num; i>0; i/=10){
        revesrdigit = revesrdigit*10+ i%10;
    
       }
        return revesrdigit;
    }
}
