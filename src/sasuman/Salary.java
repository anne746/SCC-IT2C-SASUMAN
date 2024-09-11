package sasuman;

import java.util.Scanner;

public class Salary {
    public Salaries createSalaries() {
        Scanner input = new Scanner(System.in);

        
        Salaries salaries = new Salaries();

      
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter age: ");
        int age = input.nextInt();
        System.out.print("Enter rate per hour: ");
        double rate = input.nextDouble();
        System.out.print("Enter total hours worked: ");
        double hours = input.nextDouble();
        System.out.print("Enter total deduction: ");
        double deductions = input.nextDouble();

        salaries.setDetails(name, age, rate, hours, deductions);

        input.close();

        return salaries;
    }
}
