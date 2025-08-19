public class ShortingMisslinious {
    public static void main(String[] args) {
        int arr[] = {-10,-3,2,1,4,5};
        int left = 0;
        int right = arr.length-1 ,k =0;
        int [] ans = new int[arr.length]; 
        
        while(left<right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k++]= arr[left]*arr[left];
                left++;
            }else if(arr[right]>arr[left]){
                ans[k++] = arr[right]*arr[right];
                right--;
               
            }
        }
        for(int e:ans){
            System.out.println(e);
        }
    }
}
