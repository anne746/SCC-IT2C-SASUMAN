package sasuman;

import java.util.Scanner;

public class Grade {
    Grades[] students;
    int studentCount;

    public void getGrades() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        studentCount = sc.nextInt();
        students = new Grades[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.println("Enter details for student " + (i + 1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Prelim: ");
            double prelim = sc.nextDouble();
            System.out.print("Midterm: ");
            double midterm = sc.nextDouble();
            System.out.print("Prefi: ");
            double prefi = sc.nextDouble();
            System.out.print("Final: ");
            double finalGrade = sc.nextDouble();

            students[i] = new Grades();
            students[i].addGrade(id, name, prelim, midterm, prefi, finalGrade);
        }

        calculateResults();
    }

    void calculateResults() {
        double totalClassAverage = 0;
        int passedCount = 0;
        int failedCount = 0;

        for (Grades student : students) {
            student.viewGrades();
            totalClassAverage += student.getAverage();

            if (student.getAverage() <= 3.0) {
                passedCount++;
            } else {
                failedCount++;
            }
        }

        System.out.println("--------------------------------------");
        System.out.println("Number of students: " + studentCount);
        System.out.println("Total Class Average: " + totalClassAverage / studentCount);
        System.out.println("Number of Passed: " + passedCount);
        System.out.println("Number of Failed: " + failedCount);
    }
}
