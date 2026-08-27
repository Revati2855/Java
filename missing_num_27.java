public class missing_num_27 {
    public static void main(String[] args) {
        int[] num = {0,1,2,4,5};
        int exp = 0;
        int actual = 0;
        for (int i=0; i<num.length+1; i++){
            exp = exp + i;
        }
        for(int i=0; i<num.length; i++){
            actual = actual + num[i];
        }
        int diff = exp - actual;
        System.out.print(diff);
    }
    
}
