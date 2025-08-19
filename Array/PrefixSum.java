public class PrefixSum {
    public static void main(String[] args) {
        int arr[] = {2,1,3,4,5};
        for(int i = 0; i<arr.length-1;i++){
            arr[i+1] += arr[i];
        }
        for(int e:arr){
            System.out.println(e);
        }
    }   
}
