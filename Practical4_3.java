import java.util.Scanner;

class Student {
    int rollNo;

    void setRollNo(int r) {
        rollNo = r;
    }

    int getRollNo() {
        return rollNo;
    }
}

class Test extends Student {
    int sub1, sub2;

    void setMarks(int m1, int m2) {
        sub1 = m1;
        sub2 = m2;
    }

    void getMarks() {
        System.out.println("Marks in Subject 1: " + sub1);
        System.out.println("Marks in Subject 2: " + sub2);
    }
}

interface Sports {
    int sMarks = 20;   // fixed sports marks

    void set();        // abstract method
}

class Result extends Test implements Sports {

    public void set() {
        System.out.println("Sports Marks: " + sMarks);
    }

    void displayResult() {
        int total = sub1 + sub2 + sMarks;
        System.out.println("Roll Number: " + rollNo);
        getMarks();
        set();
        System.out.println("Total Marks: " + total);
    }
}

public class Practical4_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Result obj = new Result();

        System.out.print("Enter Roll Number: ");
        int r = sc.nextInt();

        System.out.print("Enter Marks for Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Marks for Subject 2: ");
        int m2 = sc.nextInt();

        obj.setRollNo(r);
        obj.setMarks(m1, m2);

        System.out.println("\n----- Final Result -----");
        obj.displayResult();
    }
}