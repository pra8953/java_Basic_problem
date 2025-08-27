public class OddEvenSum {
    public static void main(String[] args) {
        int num = 6;
        sum(num);
    }

    public static int  sum(int num) {
        if(num==1){
            return num;
        }
        if(num%2==0){
            return sum(num-1)+num;
        }else{
            return sum(num)-num;
        }
    }
}
