package sasuman;

import java.util.ArrayList;

public class Salaries {
    String workerName;
    int workerAge;
    double wageRate;
    double hoursWorked;
    double deductions;

    static double totalGrossIncome = 0;
    static double totalDeductions = 0;
    static double totalNetIncome = 0;

    static ArrayList<Salaries> staffList = new ArrayList<>();

    public void recordDetails(String name, int age, double rate, double hours, double deduct) {
        this.workerName = name;
        this.workerAge = age;
        this.wageRate = rate;
        this.hoursWorked = hours;
        this.deductions = deduct;

        double grossIncome = rate * hours;
        double netIncome = grossIncome - deduct;

        totalGrossIncome += grossIncome;
        totalDeductions += deduct;
        totalNetIncome += netIncome;

        staffList.add(this);
    }

    public void displayPayrollSlip() {
        double grossIncome = wageRate * hoursWorked;
        double netIncome = grossIncome - deductions;

        System.out.printf("%-20s %-5d %-10.2f %-15.2f %-10.2f %-10.2f\n",
                workerName, workerAge, wageRate, hoursWorked, deductions, netIncome);
    }

    public static void displayTable() {
        System.out.printf("%-20s %-5s %-10s %-15s %-10s %-10s\n",
                "Worker Name", "Age", "Rate", "Hours Worked", "Deductions", "Net Income");
        System.out.println("---------------------------------------------------------------");
        for (Salaries staff : staffList) {
            staff.displayPayrollSlip();
        }
    }

    public static void displayTotals() {
        System.out.printf("\nTotal Gross Income: %.2f\n", totalGrossIncome);
        System.out.printf("Total Deductions: %.2f\n", totalDeductions);
        System.out.printf("Total Net Income: %.2f\n", totalNetIncome);
    }
}
