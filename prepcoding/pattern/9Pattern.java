import java.util.Scanner;

class Pattern9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int i = 1;i<=num;i++){
            for(int j = 1; j<=num;j++){
                if(i==j || i+j == num+1){
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
