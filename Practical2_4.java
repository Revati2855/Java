import java.util.Scanner;

class Student {
    int roll_no;

    void getRoll(int r) {
        roll_no = r;
    }

    void displayRoll() {
        System.out.println("Roll Number: " + roll_no);
    }
}

class Test extends Student {
    int sub1, sub2;

    void getMarks(int m1, int m2) {
        sub1 = m1;
        sub2 = m2;
    }

    void displayMarks() {
        System.out.println("Marks in Subject 1: " + sub1);
        System.out.println("Marks in Subject 2: " + sub2);
    }
}

class Result extends Test {
    void displayResult() {
        int total = sub1 + sub2;
        double percentage = total / 2.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }
}

public class Practical2_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Result obj = new Result();

        System.out.print("Enter Roll Number: ");
        int r = sc.nextInt();

        System.out.print("Enter Marks of Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Marks of Subject 2: ");
        int m2 = sc.nextInt();

        obj.getRoll(r);
        obj.getMarks(m1, m2);

        System.out.println("\n----- Student Result -----");
        obj.displayRoll();
        obj.displayMarks();
        obj.displayResult();
    }
}