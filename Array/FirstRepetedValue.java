public class FirstRepetedValue {
    public static void main(String[] args) {
        int arr[] = {1,5,3,4,6,3,4,6};
        System.out.println(firstRepeted(arr));;

    }

    public static int firstRepeted(int arr[]) {
        int repetedNum = -1;
        for(int i=0;i<=arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    
                    return repetedNum= arr[i];
                }
            }
        }
        return repetedNum;
    }
}
