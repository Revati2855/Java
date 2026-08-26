public class max_diff_26 {
    public static void main(String[] args){
        int[] num = {7, 1, 5, 3, 6, 4};
        int max = 0;
        for(int i=0; i<num.length; i++){
            for (int j=i+1; j<num.length; j++){
                int diff = num[j] - num[i];
                if(diff > max){
                    max = diff;
                }
            }
        }
        System.out.print(max);
    }
    
}
