public class two_sum_30 {
    public static void main(String[] args){
        int[] arr = {2,3,5,6,8};
        int left = 0;
        int right = arr.length-1;
        int target = 7;
        while(left < right){
            int sum = arr[left] + arr[right];
            if (target > sum){
                left ++;
            }
            else if (target < sum){
                right --;
            }
            else if (target == sum){
                System.out.print(arr[left]+" "+arr[right]);
                break;
            }
        }
    }
    
}
