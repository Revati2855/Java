import java.util.Scanner;
public class reverse_str_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        String reverse = "";
        for (int i = s.length()-1; i>=0; i--) {
            reverse = reverse + s.charAt(i);
        }
        System.out.println("Reversed string:" + reverse);
        sc.close();
    }
    
}
