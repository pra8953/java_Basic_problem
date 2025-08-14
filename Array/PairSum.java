import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number ");
        int num = input.nextInt();
        int[] arr = {4,6,3,5,8,2};
        pairSum(arr, num);
        input.close();
    }
    public static void pairSum(int[]arr,int num) {
         for(int i = 0; i<arr.length;i++){
            for(int j = i+1; j<arr.length;j++){
                if(arr[i]+arr[j] == num){
                    System.out.println(arr[i]+","+arr[j]);
                }
            }
         }
    }
}
