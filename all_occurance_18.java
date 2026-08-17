public class all_occurance_18{
    public static void main(String[] args) {
        int[] arr ={6,90,45,6,4,6,4,45};
        int target = 6;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == target){
                System.out.println("Index: "+i);
            }
        }
    }
}


