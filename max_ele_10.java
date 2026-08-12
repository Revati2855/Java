public class max_ele_10 {
    public static void main(String[] args) {
        int[] arr = {56,90,34,6,97,53};
        int max = arr[0];
        for (int i=0; i<arr.length; i++){
            if (max<arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element:"+max);
    }
}