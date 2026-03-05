class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor
    Employee(String f, String l, double salary) {
        firstName = f;
        lastName = l;

        if (salary > 0)
            monthlySalary = salary;
        else
            monthlySalary = 0.0;
    }

    // Getter
    double getMonthlySalary() {
        return monthlySalary;
    }

    // Setter
    void setMonthlySalary(double salary) {
        if (salary > 0)
            monthlySalary = salary;
    }

    String getFirstName() {
        return firstName;
    }
}

public class Practical1_1 {
    public static void main(String[] args) {

        Employee e1 = new Employee("Revati", "Kamble", 20000);
        Employee e2 = new Employee("Amit", "Patil", 25000);

        // Yearly salary
        System.out.println("Yearly Salary of " + e1.getFirstName() + " = " + (e1.getMonthlySalary() * 12));
        System.out.println("Yearly Salary of " + e2.getFirstName() + " = " + (e2.getMonthlySalary() * 12));

        // 10% raise
        e1.setMonthlySalary(e1.getMonthlySalary() * 1.10);
        e2.setMonthlySalary(e2.getMonthlySalary() * 1.10);

        System.out.println("\nAfter 10% Raise:");
        System.out.println("Yearly Salary of " + e1.getFirstName() + " = " + (e1.getMonthlySalary() * 12));
        System.out.println("Yearly Salary of " + e2.getFirstName() + " = " + (e2.getMonthlySalary() * 12));
    }
}