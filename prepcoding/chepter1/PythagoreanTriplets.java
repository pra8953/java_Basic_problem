import java.util.Scanner;

public class PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter third number: ");
        int num3 = input.nextInt();
        System.out.println(triplate(num1, num2, num3));

        input.close();
        
    }



    public static boolean triplate(int num1 ,int num2 ,int num3) {
        int k = greatest(num1, num2, num3);
        System.out.println(k);
        if(k == num1){
             return Math.pow(k, 2)== Math.pow(num2, 2)+Math.pow(num3,2);
               
                            
        } else if(k== num2){
               return Math.pow(k, 2)== Math.pow(num1, 2)+Math.pow(num3,2);
        }else{
             return Math.pow(k, 2)== Math.pow(num2, 2)+Math.pow(num1,2);
             
        }
        

        
        
    }

    public static int greatest(int num1, int num2, int num3) {

        if(num1>= num2 && num1>=num3){
            return num1;
        }else if(num2>=num3 && num2>= num1){
            return num2;
        }
        else{
            return num3;
        }
        
    }
}
