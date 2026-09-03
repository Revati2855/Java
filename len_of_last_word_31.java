public class len_of_last_word_31 {
    public static void main(String[] args){
        String s = "Hello Isha how are you";
        int i = s.length()-1;
        while (i >= 0 && s.charAt(i) == ' '){
            i--;
        }
        int count = 0;
        while(i >= 0 && s.charAt(i) != ' '){
            count++;
            i--;
        }
        System.out.println(count);
    }
    
}
