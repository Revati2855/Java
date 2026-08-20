public class remove_val_arr_22 {
    public static void main(String[] args){
        int[] arr = {3,2,2,3};
        int val = 3;
        int index = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] != val) {
                arr[index] = arr[i];
                index++;
            }
        }
        for (int i=0; i<index; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
