public class second_large_16 {
    public static void main(String[] args){
        int[] arr = {78,45,90,23,14,56,34};
        int max = arr[0];
        int sec = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++) {
            if (max < arr[i]){
                sec = max;
                max = arr[i];
            } 
            else if (sec <arr[i]){
                sec = arr[i]; 
            }
        }
        System.out.println("Largest: "+max);
        System.out.println("Second largest: "+sec);
    }
    
}
