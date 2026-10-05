import java.util.ArrayList;
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter mark of student " + i + ": ");
            marks.add(sc.nextInt());
        }

        System.out.println("Marks: " + marks);

        int highest = marks.get(0);
        int sum = 0;
        for (int m : marks) {
            if (m > highest) {
                highest = m;
            }
            sum = sum + m;
        }
        double average = (double) sum / marks.size();

        System.out.println("Highest mark: " + highest);
        System.out.println("Average mark: " + average);
    }
}
```

OUTPUT:
```text
Enter number of students: 5
Enter mark of student 1: 78
Enter mark of student 2: 92
Enter mark of student 3: 65
Enter mark of student 4: 88
Enter mark of student 5: 71
Marks: [78, 92, 65, 88, 71]
Highest mark: 92
Average mark: 78.8
