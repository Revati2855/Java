public class sort_17 {
    public static void main(String[] args){
        int[] arr = {89,56,45,90,97,23};
        boolean sort=true;
        for (int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                sort = false;
                break;
            }
        }
        if (sort) {
            System.out.println("Sorted");
        }
        else {
            System.out.println("Not sorted");
        }
    }
    
}
