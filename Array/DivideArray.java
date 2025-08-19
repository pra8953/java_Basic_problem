public class DivideArray {
    public static void main(String[] args) {
        int arr [] ={1,3,2,4,5};
        int prefix[] = new int [arr.length];
        int suffix[] = new int [arr.length];
        int n = arr.length;

        // prefix calculation
        prefix[0] = arr[0];
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        // suffix calculation
        suffix[n-1] = arr[n-1];
        for(int i = n-2; i >= 0; i--){
            suffix[i] = suffix[i+1] + arr[i];
        }

        // check equilibrium index
        boolean isTrue = false;
        int index = -1;
        for(int i = 0; i < n; i++){
            if(prefix[i] == suffix[i]){
                isTrue = true;
                index = i;
                break;
            }
        }

        // print suffix
        System.out.println("Suffix array:");
        for(int e : suffix){
            System.out.print(e + " ");
        }
        System.out.println();

        // print prefix
        System.out.println("Prefix array:");
        for(int l : prefix){
            System.out.print(l + " ");
        }
        System.out.println();

        System.out.println(isTrue +" at index "+index);
    }
}
