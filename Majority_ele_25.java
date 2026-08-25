public class Majority_ele_25{
    public static void main(String[] args){

        int[] nums = {4, 4, 2, 4, 3, 4, 4};
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count > nums.length / 2) {
                System.out.println(nums[i]);
                break;
            }
        }
    }
}
