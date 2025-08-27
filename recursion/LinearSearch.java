public class LinearSearch {
    public static void main(String[] args) {

        // int[] a ={4,12,54,14,3,8,6,1};
        // int[] a ={1,2,3,2,2,5};
        int[] a ={8,8,8};
        // if(linearSearch(a, a.length-1, 114)){
        //     System.out.println("Yes");
        // }else{
        //     System.out.println("No");
        // }
        searchelement(a, a.length-1, 8);


        
    }


    public static void searchelement(int a[],int i,int x) {
        if(i<0){
            return ;
        }
        searchelement(a, i-1, x);
        if(a[i]==x){
            System.out.println(i);
        }
        
    }

    public static boolean linearSearch(int[] a, int i,int x) {
        if(i<0){
            return false;
        }
        if(a[i]==x){
            return true;
        }
        return linearSearch(a, i-1, x);
        
    }
}
