package sasuman;

import java.util.Scanner;

public class Salary {
    public void gatherDetails() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of Employees: ");
        int numEmployees = input.nextInt();
        input.nextLine();

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details for employee " + (i + 1));

            System.out.print("Enter worker name: ");
            String workerName = input.nextLine();
            System.out.print("Enter worker age: ");
            int workerAge = input.nextInt();
            System.out.print("Enter hourly rate: ");
            double wageRate = input.nextDouble();
            System.out.print("Enter total hours worked: ");
            double hoursWorked = input.nextDouble();
            System.out.print("Enter total deductions: ");
            double deductions = input.nextDouble();
            input.nextLine();

            Salaries salaryDetails = new Salaries();
            salaryDetails.recordDetails(workerName, workerAge, wageRate, hoursWorked, deductions);
        }

       
        Salaries.displayTable();
        Salaries.displayTotals();
        input.close();
    }

 
}
