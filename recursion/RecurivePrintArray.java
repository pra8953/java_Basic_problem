public class RecurivePrintArray {
    public static void main(String[] args) {
        int[] arr ={5,2,1,4,7};
        printElement(arr, arr.length-1 );
        
    }

    public static void printElement(int[] arr,int i) {
        
        if(i<0){
            return ;
        }
        printElement(arr, i-1);
        System.out.println(arr[i]);
    }
}
