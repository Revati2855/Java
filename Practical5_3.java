package MathOperations;

class FloorOperation {

    void findFloor(double num) {
        System.out.println("Floor value: " + Math.floor(num));
    }
}

class CeilOperation {

    void findCeil(double num) {
        System.out.println("Ceil value: " + Math.ceil(num));
    }
}

class RoundOperation {

    void findRound(double num) {
        System.out.println("Round value: " + Math.round(num));
    }
}

public class Practical5_3 {

    public static void main(String[] args) {

        double number = 5.7;

        FloorOperation f = new FloorOperation();
        CeilOperation c = new CeilOperation();
        RoundOperation r = new RoundOperation();

        System.out.println("Number: " + number);

        f.findFloor(number);
        c.findCeil(number);
        r.findRound(number);
    }
}
