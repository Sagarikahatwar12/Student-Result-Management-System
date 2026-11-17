import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student Result System");

        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();
        System.out.print("Roll Number: ");
        int rollNumber = sc.nextInt();

        System.out.print("Java Marks: ");
        int javaMarks = sc.nextInt();
        System.out.print("DBMS Marks: ");
        int dbmsMarks = sc.nextInt();
        System.out.print("Maths Marks: ");
        int mathsMarks = sc.nextInt();

        int total = javaMarks + dbmsMarks + mathsMarks;
        double percentage = (total * 100.0) / 300;

        System.out.println("Name = " + studentName);
        System.out.println("Roll Number = " + rollNumber);
        System.out.println("Total marks = " + total);
        System.out.println("Percentage = " + percentage + "%");

        if (percentage >= 40) {
            System.out.println("Result = PASS");
        } else {
            System.out.println("Result = FAIL");
        }
    }
}