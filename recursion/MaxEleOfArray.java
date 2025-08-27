public class MaxEleOfArray {
    public static void main(String[] args) {
        int [] arr ={1,4,5,2,6,8,0,7,9,1};

        System.out.println(max(arr,arr.length-1));
    }

    public static int max(int[] arr,int i) {
        // int max = arr[i];
        if(i==0){
            return arr[0];
        }

        int maxValue = max(arr, i-1);
        if(arr[i]>maxValue){
            maxValue = arr[i];
        }
        return maxValue;
    }
}
