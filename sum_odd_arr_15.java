public class sum_odd_arr {
    public static void main(String[] args) {
        int[] arr = {90,45,12,45,87};
        int sum = 0;
        for (int i = 0; i<arr.length; i++){
            if (arr[i]%2 != 0){
                sum = sum+arr[i];
            }
        }
        System.out.println("Sum of odd num in array: "+sum);
    }
}
