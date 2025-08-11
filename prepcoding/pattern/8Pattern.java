import java.util.Scanner;

class Pattern8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int i = 1; i<=num;i++){
            for(int j = 5; j>=1;j--){
                if(i==j){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        input.close();
    }
}
