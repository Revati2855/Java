public class min_ele_11 {
    public static void main(String[] args){
        int[] arr = {78,90,54,34,80};
        int min = arr[0];
        for (int i=0; i<arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Minmum element: "+ min);
    }
    
}
