public class MaxValueInArray {
    public static void main(String[] args) {

        int[] arr = {1,2,5,6,9,0,11,12,2,3};
        System.out.println(findMax(arr));
        
    }
    public static int findMax(int[]arr) {

        int maxValue = 0;
        for(int a: arr){
            if(maxValue< a){
                maxValue = a;
            }
        }
        return maxValue;
    }
}
