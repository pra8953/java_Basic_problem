import java.util.Scanner;

class Pattern15 {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        int num = input.nextInt();
        int space = num/2;
        int star = 1;
        int number = 1;
        for(int i = 1; i<=num;i++){
            // System.out.println(space+" "+star);

            for(int k = 1; k<= space;k++){
                System.out.print(" ");
            }
            int m = number;
            for(int k = 1; k<=star;k++){
                System.out.print(m+" ");
                
                if(k<=star/2){
                    m++;

                }else{
                    m--;
                }
            }
            System.out.println();
            if(i<=num/2){
            number++;
            space--;
            star+=2;
            }else{
                space++;
                star-=2;
                number--;
            }
        }

       input.close(); 

    }
}
