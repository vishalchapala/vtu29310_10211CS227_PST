import java.util.Scanner;
import java.util.TreeSet;

public class SortedMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> marks = new TreeSet<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter mark " + i + ": ");
            marks.add(sc.nextInt());
        }

        System.out.println("Unique marks in ascending order: " + marks);
    }
}
```

OUTPUT:
```text
Enter number of students: 8
Enter mark 1: 75
Enter mark 2: 60
Enter mark 3: 90
Enter mark 4: 75
Enter mark 5: 85
Enter mark 6: 60
Enter mark 7: 95
Enter mark 8: 70
Unique marks in ascending order: [60, 70, 75, 85, 90, 95]
