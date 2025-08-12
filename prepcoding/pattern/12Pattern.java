class Pattern12 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        // System.out.print(num1);
        for(int i = 1; i<=5;i++){
            // System.out.println(num3);
            
            for(int j = 1; j<=i;j++){
                int num3 = num1;
                System.out.print(num3+" ");
                num3 = num1+num2;
                num1 = num2;
                num2 = num3;
            }
            System.out.println();
            
        }
    }
}
