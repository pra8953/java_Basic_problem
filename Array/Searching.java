import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = {1,4,7,9,10};
        int num = input.nextInt();
        for(int ele:arr){
            if(ele==num){
                System.out.println("yes");
                break;
            }
        }
        input.close();
    }
}
