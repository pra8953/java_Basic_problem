public class PrefixSumRange {
    public static void main(String[] args) {
        int arr[] ={2,4,1,3,6,5};
        int l = 3-1;
        int r = 5-1;
        for(int i = 1; i<arr.length;i++){
            arr[i]+= arr[i-1];
        }
        for(int e:arr){
            System.out.println(e);
        }
        int sum = arr[r]- arr[l-1];
        System.out.println(sum);
    }
}
