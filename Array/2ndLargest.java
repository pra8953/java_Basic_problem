
class SecondndLargest {
    public static void main(String[] args) {
        // int arr[] ={5,4,1,6,2};
        int arr[] ={0,-2,0,-3,0,-4};
        System.out.println(secondLargest(arr));

    }
    public static int secondLargest(int []arr){
        int big=0;
        int second_largest =0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>big){
                big=arr[i];
            }
        }
        for(int i =0; i<arr.length;i++){
            if(arr[i]==big){
                arr[i]=Integer.MIN_VALUE;
                break;
            }
        }
        // for(int e:arr){
        //     System.out.println(e);
        // }
         for(int i = 0; i<arr.length;i++){
            if(arr[i]>second_largest){
                second_largest=arr[i];
            }
        }
        return second_largest;
    }
}
