public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        reverseArray(arr);
       
    }

    public static void reverseArray(int arr[]) {
        int j =0;
        // int [] ans = new int[arr.length];

        // for(int i = arr.length-1;i>=0;i--){
        //     ans[j] = arr[i];
        //     j++;

        // }
        // return ans;
        for(int i= arr.length-1;i>j;i--){
            arr[i] = arr[i]+arr[j];
            arr[j] = arr[i]-arr[j];
            arr[i] = arr[i]-arr[j];
            j++;
        }
        for(int e:arr){
            System.out.println(e);
        }

    }
}
