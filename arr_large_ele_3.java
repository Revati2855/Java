public class arr_large_ele_3 {
    public static void main(String[] args) {
        int arr[] = {39,78,56,90,32,55};
        int max = arr[0];
        for (int i=1; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest :"+ max);
    }
}