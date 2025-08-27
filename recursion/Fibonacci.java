public class Fibonacci {
    public static void main(String[] args) {
        
        for(int i =0;i<7;i++){

            System.out.println(fibonacci(i));
        }
    }

    public static int fibonacci(int num) {
       if(num == 0|| num==1){
            return num;
       }
       int prev = fibonacci(num-1);
       int prevPrev = fibonacci(num-2);

       return prev+prevPrev;
    }
}
