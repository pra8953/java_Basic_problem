public class OddEven {
    public static void main(String[] args) {
        int[] arr ={1,3,4,5,6,8};
        int left = 0;
        int right = arr.length-1;
        while (left<right) {
            
            
           
            if(arr[left]%2!=0 && arr[right]%2==0){
                arr[left] = arr[left]+arr[right];
                arr[right] = arr[left]-arr[right];
                arr[left] = arr[left]-arr[right];
                left++;
                right--;
            }else if(arr[left]%2==0){
                left++;
            }
            else if(arr[right]%2 != 0){
                right--;
            }
        }
        for(int e:arr){
            System.out.println(e);
        }
    }
}
