public class count_positive_no_14 {
    public static void main(String[] args) {
        int[] arr = {-9,87,56,-75,59,12};
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if (arr[i] > 0 ){
                count += 1;
            }
        }
        System.out.println("Count of positive in array is: "+count);
    }
}
