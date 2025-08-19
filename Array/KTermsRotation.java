public class KTermsRotation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[]ar=   karr(arr, 2);
        for(int e:ar){
            System.out.println(e);
        }
    }
    public static int[] karr(int[]arr,int k) {
        // int[] ans = new int[arr.length];
        int n = k%arr.length;
        int j = 0;
        for(int i = arr.length-n;i<arr.length;i++){
            arr[i] = arr[i]+arr[j];
            arr[j] = arr[i]-arr[j];
            arr[i] = arr[i]-arr[j];
            j++;
        }
        for(int i= 0;i<arr.length-n;i++){
            arr[i] = arr[i]+arr[j];
            arr[j] = arr[i]-arr[j];
            arr[i] = arr[i]-arr[j];
        }
        return arr;
    }
}
