public class AlterNativeSum {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumTillN(n));
    }
    public static int sumTillN(int n) {
        if(n==0){
            return n;
        }
        return n+sumTillN(n-1);
    }
}
