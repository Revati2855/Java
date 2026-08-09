import java.util.Scanner;
public class count_digit_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:");
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            n = n/10;
            count++;
        }
        System.out.println("count of digits:"+count);
        sc.close();
    }
}