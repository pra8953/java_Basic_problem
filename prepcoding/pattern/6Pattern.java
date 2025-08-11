class Pattern6 {
    public static void main(String[] args) {
        int num = 5;
        int star = num/2+1;
        int space = 1;
        for(int i = 1;i<=num;i++){
            // System.out.println(star+","+space+","+star);
            for(int j = 1;j<=star;j++){
                System.out.print("*");
            }
             for(int j = 1;j<=space;j++){
                System.out.print(" ");
            }
             for(int j = 1;j<=star;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<=num/2){
                star--;
                space+=2;
            }else{
                star++;
                space-=2;
            }
        }

    }
}
