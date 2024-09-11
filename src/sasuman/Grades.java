package sasuman;

public class Grades {
    int id;
    String name;
    double prelim;
    double midterm;
    double prefi;
    double finalGrade;

    public void addGrade(int sid, String sname, double sp, double sm, double spf, double sf) {
        this.id = sid;
        this.name = sname;
        this.prelim = sp;
        this.midterm = sm;
        this.prefi = spf;
        this.finalGrade = sf;
    }

    public double getAverage() {
        return (prelim + midterm + prefi + finalGrade) / 4;
    }

    public void viewGrades() {
        double average = getAverage();
        String remarks = (average <= 3.0) ? "Passed" : "Failed";

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Prelim: " + prelim);
        System.out.println("Midterm: " + midterm);
        System.out.println("Prefi: " + prefi);
        System.out.println("Final: " + finalGrade);
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Remarks: " + remarks);
    }
}
