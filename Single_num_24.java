public class Single_num_24 {
    public static void main(String[] args){
        int[] num = {4,2,1,2,1};
        int result =0;
        for (int i=0; i<num.length; i++) {
            result = result^num[i];
        }
        System.out.println(result);
    }
    
}
