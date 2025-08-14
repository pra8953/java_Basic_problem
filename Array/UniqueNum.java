public class UniqueNum {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,1,2,3,5,8,8};
        System.out.println(uniqueNumber(arr));;
    }

    public static int uniqueNumber(int[]arr) {
        int unique = 0;
        for(int i =0;i<=arr.length;i++){
            for(int j = i+1; j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=arr[j]=0;
                }
            }
        }
        return unique;
    }
}
