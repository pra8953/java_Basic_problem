public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {7,1,9,7,4,3,9,10};
        int max = 0;
        for(int i = 0; i<arr.length;i++){
            if(max<=arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
