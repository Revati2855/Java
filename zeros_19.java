public class zeros_19 {
    public static void main(String[] args){
        int[] arr = {4, 0, 0, 7, 2};
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if (arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
        }
        for(int i=index; i<arr.length; i++){
            arr[i] = 0;
        }
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
}
      

