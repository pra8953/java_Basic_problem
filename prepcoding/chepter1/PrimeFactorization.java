public class PrimeFactorization {
    public static void main(String[] args) {
        int num = 1440;
         int i = 2;
       while(num!=1){
       
            if(num%i == 0){
                num /= i;
                System.out.println(i);
            }else{
                     i++;
            }
           
       }
    }
}
