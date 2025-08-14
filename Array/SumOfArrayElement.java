public class SumOfArrayElement {
    public static void main(String[] args) {
        int arr[] = {1,3,4,6,0,0,0,10};
        int sum =0;
        for(int i = 0; i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
