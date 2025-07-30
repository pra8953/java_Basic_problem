public class Fibonacci{
    public static void main(String[] args) {
        fibonacci(13);
    }

    public static void fibonacci(int num) {
       if(num<0) return;
       System.out.print("0 ");
       if(num == 0) return;
       System.out.print("1 ");
       int f = 0 , s = 1;
       while(f+s<=num){
        int t = f+s;
        System.out.print(t+" ");
        f = s;
        s = t;
       }
    }
}