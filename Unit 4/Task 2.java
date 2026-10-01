import java.util.ArrayList;
import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Dynamic array
        ArrayList<Integer> marks = new ArrayList<>();

        System.out.println("Student Marks Management System");
        System.out.println("--------------------------------");

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Add marks one by one
        for (int i = 0; i < n; i++) {

            System.out.print("Enter marks for student " + (i + 1) + ": ");
            int mark = sc.nextInt();

            marks.add(mark);
        }

        // Display marks
        System.out.println("\nStudent Marks:");

        for (int i = 0; i < marks.size(); i++) {
            System.out.println(
                "Student " + (i + 1) + " : " + marks.get(i)
            );
        }

        // Calculate total
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        // Calculate average
        double average = (double) total / marks.size();

        System.out.println("\nTotal Marks = " + total);
        System.out.println("Average Marks = " + average);

        sc.close();
    }
}



OUTPUT
Student Marks Management System
--------------------------------
Enter number of students: 4
Enter marks for student 1: 95
Enter marks for student 2: 96
Enter marks for student 3: 97
Enter marks for student 4: 98

Student Marks:
Student 1 : 95
Student 2 : 96
Student 3 : 97
Student 4 : 98

Total Marks = 386
Average Marks = 96.5
