import java.util.Scanner;

class Pattern13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int num = input.nextInt();

        for(int i=0;i<num;i++){
            int icj =1;
            for(int j= 0; j<=i;j++){
                System.out.print(icj+" ");
                int  icjp1 = icj*(i-j)/(j+1);
                icj = icjp1;
                
            }
           
            System.out.println();
        }
        input.close();
    }
}
