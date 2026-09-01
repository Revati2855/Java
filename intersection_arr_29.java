import java.util.Arrays;

public class intersection_arr_29 {
    public static void main(String[] args){
        int[] num1= {1,2,4,3};
        int[] num2= {7,8,3,4};
        int[] result = new int[num1.length];
        int index = 0;
        for (int i=0; i<num1.length; i++){
            boolean found = false;
            for(int j=0; j<num2.length; j++){
                if(num1[i] == num2[j]){
                    found = true;
                    break;
                }
            }
            boolean alreadyexits = false;
            for (int k=0; k<index; k++){
                if (result[k] == num1[i]){
                    alreadyexits = true;
                    break;
                }
            }
            if(found && !alreadyexits){
                result[index] = num1[i];
                index++;
            }
        }
        System.out.print(Arrays.toString(Arrays.copyOf(result, index)));
    }
    
}
