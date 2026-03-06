class Employee {
    String name;
    String address;
    double salary;
    String jobTitle;

    Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    double calculateBonus() {
        return salary * 0.10;
    }

    void performanceReport() {
        System.out.println("Performance report of " + name + " is Good.");
    }

    void manageProject() {
        System.out.println(name + " is managing a project.");
    }
}

class Manager extends Employee {
    Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    @Override
    double calculateBonus() {
        return salary * 0.20;
    }
}

class Developer extends Employee {
    Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    @Override
    double calculateBonus() {
        return salary * 0.15;
    }
}

class Programmer extends Employee {
    Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    @Override
    double calculateBonus() {
        return salary * 0.12;
    }
}

public class Practical2_2 {
    public static void main(String[] args) {

        Manager m = new Manager("Revati", "Mumbai", 60000);
        Developer d = new Developer("Amit", "Pune", 50000);
        Programmer p = new Programmer("Neha", "Kolhapur", 40000);

        System.out.println(m.name + " Bonus: " + m.calculateBonus());
        m.performanceReport();
        m.manageProject();

        System.out.println();

        System.out.println(d.name + " Bonus: " + d.calculateBonus());
        d.performanceReport();

        System.out.println();

        System.out.println(p.name + " Bonus: " + p.calculateBonus());
        p.performanceReport();
    }
}