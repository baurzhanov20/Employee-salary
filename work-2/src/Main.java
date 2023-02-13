import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean running = true;
        while (running){
            System.out.print("Name of the Employee : ");
            String name = in.next();
            System.out.print("Base pay for this employee : ");
            double basePay = in.nextDouble();
            Employee employee = new Employee(basePay,name);
            System.out.print("How many hours employee worked this week : ");
            int hours = in.nextInt();
            System.out.println(employee.getName() + " must get at this week " + employee.calculateSalary(hours) + " dollars.");
        }
    }
}