// import java.lang.reflect.Array;

import java.util.Arrays;

public class KthLargestAndSmallest {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,8,9};
        kthSmallestandGreatest(arr, 7);
        
    }


    public static void kthSmallestandGreatest(int[]arr,int k) {
        Arrays.sort(arr);
        if(k-1>arr.length){
            System.out.println("Enter vaid range");
        }else{
            System.out.println((k-1)+"smallest element is"+arr[k-1]);
            System.out.println((k-1)+"greatest element is"+arr[arr.length-k]);
        }
        
    }
}
