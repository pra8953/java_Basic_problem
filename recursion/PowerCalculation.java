public class PowerCalculation {
    public static void main(String[] args) {
        System.out.println(powerCalculation(2, 07));
    }
    public static int powerCalculation(int p, int q) {
        if(q==0) return 1;
        if(q==1){
            return p;
        }
        // return p* powerCalculation(p,q-1);
        if(q%2==0){
            int half =  powerCalculation(p, q/2);
            System.out.println(half);

            return half*half;
        }else{
            int half = powerCalculation(p, q/2);
            System.out.println(half);
            return half*half*p;
        }
    }
}
