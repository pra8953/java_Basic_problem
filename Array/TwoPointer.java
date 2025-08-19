public class TwoPointer {
    public static void main(String[] args) {
        int arr[]= {1,0,0,1,1,0,0,1,1,0};
        int left =0;
        int right = arr.length-1;
        while (left<right) {
        if(arr[left]==0){
            left++;
        }
        if(arr[right]==1){
            right--;
        }
        if(arr[left]==1 && arr[right]==0){
            arr[left]  = arr[left]+arr[right];
            arr[right] = arr[left]-arr[right];
            arr[left]  = arr[left]-arr[right];
            left++;
            right--;
        }
       
        }
         for(int e:arr){
            System.out.println(e);
        }
    }
}
