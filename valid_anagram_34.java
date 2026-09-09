import java.util.Arrays;

public class valid_anagram_34 {
    public static void main(String[] args){
        String s1 = "anagram";
        String s2 = "nagaram";
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1,arr2)){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
    }
    
}


