import java.util.Scanner;

public class TriplateSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {4,6,3,5,8,2};
        System.out.print("Enter number ");
        int num = input.nextInt();
        triplateSum(arr, num);
        input.close();
    }

    public static void triplateSum(int[]arr , int num) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k = j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==num){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
            }
        }
    }
}
