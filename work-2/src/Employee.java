public class Employee {
    private double basePay;
    private String name;
    public Employee(double basePay,String name) {
        this.basePay = basePay;
        this.name = name;
    }

    public double calculateSalary(double hoursWorked) {
        if (hoursWorked > 60) {
            hoursWorked = 60;
        }
        if (hoursWorked <= 40) {
            return basePay * hoursWorked;
        }
        double overtime = hoursWorked - 40;
        double overtimePay = basePay * 1.5 * overtime;
        return 40 * basePay + overtimePay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
