public class ZeroOneShort {
    public static void main(String[] args) {
        int[] arr ={1,0,1,0,1,0,1,0,1,0};
        int count = 0;
        for (int i =0; i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
        }
        System.out.println(count);
        for(int i =0; i<=count;i++){
            arr[i] = 0;
        }
        for(int i = count;i<arr.length;i++){
            arr[i] =1;
        }
        for(int e:arr){
            System.out.println(e);
        }
    }
}
