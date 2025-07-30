import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        int password;
        do{
            Scanner input  = new Scanner(System.in);
            System.out.println("Enter you password");
            password = input.nextInt();

        }while(password != 123);
        System.out.println("You guess password");
    }
}
