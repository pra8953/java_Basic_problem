public class SumOfArray {
    public static void main(String[] args) {
        int a[] ={5,2,1};
        System.out.println(sumOfDigits(a, a.length-1));
    }

    public static int sumOfDigits(int [] arr,int i) {
        if(i<0){
            return 0;
        }
        return sumOfDigits(arr, i-1)+arr[i];
    }
}
