public class CheckSorted {
    public static void main(String[] args) {
        // int arr[] = {1,3,2,10,5};
        int arr[] = {5,4,3,2,1};
        // int arr[] = {1,3,5,10,15};
        // int arr[] = {1,5,5,5,7,8};

        // if(arr[0]>arr[1]){
        //     for(int i = 0; i< arr.length;i++){
        //         if()
        //     }
        // }

        System.out.println(checksorted(arr));
    }
    public static boolean checksorted(int[]arr) {

        boolean check = false;
       if(arr[0]>arr[1]){
            for(int i = 0; i< arr.length-1;i++){
                if(arr[i]>=arr[i+1]){
                    check = true;
                }else{
                    return false;
                }
            }
        }else{
            for(int i = 0; i <arr.length-1;i++){
                if(arr[i]<=arr[i+1]){
                    check = true;
                }else{
                    check = false;
                }
            }
        }
        return check;
    }
}
