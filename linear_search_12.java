public class linear_search_12 {
    public static void main(String[] args) {
        int[] arr = {67,90,45,34,76};
        int target = 90;
        for (int i=0 ; i<arr.length; i++) {
            if (arr[i] == target){
                System.out.println("Found at index: " + arr[i]);
                return;
            }
            
        }
        System.out.println("Not found.");
    }
    
}
