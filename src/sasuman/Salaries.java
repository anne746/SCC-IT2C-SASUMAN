package sasuman;

public class Salaries {
    String name;
    int age;
    double rate;
    double hours;
    double deductions;

   
    public void setDetails(String name, int age, double rate, double hours, double deductions) {
        this.name = name;
        this.age = age;
        this.rate = rate;
        this.hours = hours;
        this.deductions = deductions;
    }

    
    public void displaySlip() {
        System.out.println("Slip details:");
        System.out.println("Date: Aug 14, 2024");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Total gross: " + (rate * hours));
        System.out.println("Total deductions: " + deductions);
        System.out.println("----------------------------------");
        System.out.println("Net pay: " + ((rate * hours) - deductions));
    }
}
