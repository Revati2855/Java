public class square_sort_arr_32 {
    public static void main(String[] args){
        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = new int[nums.length];
        int left=0;
        int right=nums.length-1;
        int index=result.length-1;
        while (left <= right){
            int lefts = nums[left] * nums[left];
            int rights = nums[right] * nums[right];
            if (lefts > rights){
                result[index] = lefts;
                left ++;
                index --;
            }
            else {
                result[index] = rights;
                right --;
                index --;
            }
        }
        for (int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
    
}
